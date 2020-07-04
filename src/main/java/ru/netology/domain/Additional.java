package ru.netology.domain;

public class Additional {

    private enum complain { SPAM, INSULT, MATERIAL_FOR_ADULTS, CHILD_PORNOGRAPHY, DRUG_PROPAGANDA,
        ARMS_SALE, VIOLENCE, CALL_FOR_HARASSMENT, CALL_FOR_SUICIDE, ANIMAL_ABUSE, MISLEADING, FRAUD,
        EXTREMISM, AFTERMARKET_CONTENT
    }
    private boolean saveInBookmarks;

    public boolean isSaveInBookmarks() {
        return saveInBookmarks;
    }

    public void setSaveInBookmarks(boolean saveInBookmarks) {
        this.saveInBookmarks = saveInBookmarks;
    }



}
