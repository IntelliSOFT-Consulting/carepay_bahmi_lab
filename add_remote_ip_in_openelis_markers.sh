#!/bin/sh
set -e -x
. /etc/bahmni-installer/bahmni.conf


psql -U clinlims -h  $OPENELIS_DB_SERVER  -c "UPDATE
   markers
 SET
   feed_uri_for_last_read_entry = regexp_replace(
       feed_uri_for_last_read_entry, 'http://.*/openmrs', 'http://localhost:8050/openmrs'
   ),
   feed_uri = regexp_replace(
       feed_uri, 'http://.*/openmrs', 'http://localhost:8050/openmrs'
   ) where feed_uri ~ 'openmrs';"

psql -U clinlims -h  $OPENELIS_DB_SERVER  -c " UPDATE
     failed_events
    SET
     feed_uri = regexp_replace(
         feed_uri, 'http://.*/openmrs', 'http://localhost:8050/openmrs'
     )
    where feed_uri ~'openmrs';"

