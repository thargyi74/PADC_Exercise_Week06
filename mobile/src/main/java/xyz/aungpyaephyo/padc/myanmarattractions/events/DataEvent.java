package xyz.aungpyaephyo.padc.myanmarattractions.events;

import java.util.List;

import xyz.aungpyaephyo.padc.myanmarattractions.data.vos.AttractionVO;

/**
 * Created by aung on 7/9/16.
 */
public class DataEvent {

    public static class AttractionDataLoadedEvent {
        private String extraMessage;
        private List<AttractionVO> attractionList;

        public AttractionDataLoadedEvent(String extraMessage) {
            this.extraMessage = extraMessage;
            //this.attractionList = attractionList;
        }

        public String getExtraMessage() {
            return extraMessage;
        }

        public List<AttractionVO> getAttractionList() {
            return attractionList;
        }
    }
}