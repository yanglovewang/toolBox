package com.yang.mysql;

import java.util.List;

public class TestGson {
    /**
     * examName : mock
     * examTime :
     * subjectList : [{"titleName":"","type":1,"upset":true,"content":[{"content":"","flag":true},{"content":"","flag":true}],"text":"","duration":10,"standard":{"back":"","accuracy":"","thresholdValue":""}}]
     */

    private String examName;
    private String examTime;
    private List<SubjectListBean> subjectList;

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public List<SubjectListBean> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<SubjectListBean> subjectList) {
        this.subjectList = subjectList;
    }

    public static class SubjectListBean {
        /**
         * titleName :
         * type : 1
         * upset : true
         * content : [{"content":"","flag":true},{"content":"","flag":true}]
         * text :
         * duration : 10
         * standard : {"back":"","accuracy":"","thresholdValue":""}
         */

        private String titleName;
        private int type;
        private boolean upset;
        private String text;
        private int duration;
        private StandardBean standard;
        private List<ContentBean> content;

        public String getTitleName() {
            return titleName;
        }

        public void setTitleName(String titleName) {
            this.titleName = titleName;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public boolean isUpset() {
            return upset;
        }

        public void setUpset(boolean upset) {
            this.upset = upset;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public StandardBean getStandard() {
            return standard;
        }

        public void setStandard(StandardBean standard) {
            this.standard = standard;
        }

        public List<ContentBean> getContent() {
            return content;
        }

        public void setContent(List<ContentBean> content) {
            this.content = content;
        }

        public static class StandardBean {
            /**
             * back :
             * accuracy :
             * thresholdValue :
             */

            private String back;
            private String accuracy;
            private String thresholdValue;

            public String getBack() {
                return back;
            }

            public void setBack(String back) {
                this.back = back;
            }

            public String getAccuracy() {
                return accuracy;
            }

            public void setAccuracy(String accuracy) {
                this.accuracy = accuracy;
            }

            public String getThresholdValue() {
                return thresholdValue;
            }

            public void setThresholdValue(String thresholdValue) {
                this.thresholdValue = thresholdValue;
            }
        }

        public static class ContentBean {
            /**
             * content :
             * flag : true
             */

            private String content;
            private boolean flag;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public boolean isFlag() {
                return flag;
            }

            public void setFlag(boolean flag) {
                this.flag = flag;
            }
        }
    }

    public static void main(String[] args) {
        TestGson testGson = new TestGson();
        System.out.println("ddd");
    }
}
