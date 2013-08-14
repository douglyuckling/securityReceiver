package securityreceiver.domain

import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable

@Immutable
@EqualsAndHashCode
class Snapshot {
    String id
    String deviceId
    Date compositionTime
    String location
    String batteryLevel
}
