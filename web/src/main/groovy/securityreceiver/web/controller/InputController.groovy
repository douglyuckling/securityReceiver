package securityreceiver.web.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import securityreceiver.domain.Snapshot
import securityreceiver.services.SnapshotService

import static org.springframework.web.bind.annotation.RequestMethod.POST

@Controller
@RequestMapping('/input')
class InputController {

    @Autowired
    private SnapshotService snapshotService

    @RequestMapping(value = '/update', method = POST)
    @ResponseBody
    void handleUpdate(@RequestBody Snapshot snapshot) {
        snapshotService.save(snapshot)
    }

}
