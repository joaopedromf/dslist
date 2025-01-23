package com.joaopedromf.dslist.projections;

public interface GameMinProjection {
    long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
