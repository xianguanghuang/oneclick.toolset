package oneclick.toolset;

import com.alibaba.otter.node.extend.processor.AbstractEventProcessor;
import com.alibaba.otter.shared.etl.model.EventData;
import com.alibaba.otter.shared.etl.model.EventType;

/**
 * Created by xianguanghuang on 2017/4/30.
 */
public class SkipDeleteEventProcessor extends AbstractEventProcessor {

    @Override
    public boolean process(EventData eventData) {

        if (eventData.getEventType() == EventType.DELETE){
            return false;
        }else {
            return true;
        }

    }
}
