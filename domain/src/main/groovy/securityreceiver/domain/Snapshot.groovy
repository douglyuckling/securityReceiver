package securityreceiver.domain
import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Snapshot {
    String id
    String deviceId
    Date compositionTime
    String location
    String batteryLevel
}
