package securityreceiver.web.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import securityreceiver.domain.Snapshot
import securityreceiver.services.SnapshotService

import static org.springframework.web.bind.annotation.RequestMethod.GET

@Controller
@RequestMapping('/data')
public class GuiDataController {

    @Autowired
    private SnapshotService snapshotService

    @RequestMapping(value = '/snapshots', method = GET)
    @ResponseBody
    public List<Snapshot> getSnapshots() {
        return snapshotService.findAll()
    }

}
