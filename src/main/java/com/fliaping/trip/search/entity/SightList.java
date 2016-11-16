package com.fliaping.trip.search.entity;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Payne on 4/5/16.
 */
public class SightList {
    private List sights;

    private List<SightFacetField> sightFacetFields;
    private List<SightFacetRange> sightFacetRanges;
    private List<SightFacetQuery> sightFacetDistances;

    private long totalNum;

    private int totalPage;

    private int nowPage;

    private long time;

    public SightList(){
    }

    public void add(SightBrief sight){
        sights.add(sight);
    }
    public int size(){
        return sights.size();
    }
    public String toJson(){
        Gson json = new Gson();
        return json.toJson(this);
    }

    public List<SightBrief> getSights() {
        return sights;
    }


    public long getTotalNum() {
        return totalNum;
    }


    public int getTotalPage() {
        return totalPage;
    }

    public int getNowPage() {
        return nowPage;
    }

    public long getTime() {
        return time;
    }

    public List getSightFacetFields() {
        return sightFacetFields;
    }

    public void setSights(List sights) {
        this.sights = sights;
    }

    public void setTotalNum(long totalNum) {
        this.totalNum = totalNum;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public void setTime(long time) {
        this.time = time;
    }



    public List getSightFacetRanges() {
        return sightFacetRanges;
    }



    public void setSightFacetFields(List<SightFacetField> sightFacetFields) {
        this.sightFacetFields = sightFacetFields;
    }

    public void setSightFacetRanges(List<SightFacetRange> sightFacetRanges) {
        this.sightFacetRanges = sightFacetRanges;
    }

    public List<SightFacetQuery> getSightFacetDistances() {
        return sightFacetDistances;
    }

    public void setSightFacetDistances(List<SightFacetQuery> sightFacetDistances) {
        this.sightFacetDistances = sightFacetDistances;
    }

}
