package com.hello.model;

import java.util.Date;

public class FarmDesc {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.farm_id
     *
     * @mbg.generated
     */
    private Long farmId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.picture
     *
     * @mbg.generated
     */
    private String picture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.position
     *
     * @mbg.generated
     */
    private Short position;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.is_deleted
     *
     * @mbg.generated
     */
    private Boolean isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.is_faked
     *
     * @mbg.generated
     */
    private Boolean isFaked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.created
     *
     * @mbg.generated
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.updated
     *
     * @mbg.generated
     */
    private Date updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.updated_by
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column farm_desc.summary
     *
     * @mbg.generated
     */
    private String summary;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.id
     *
     * @return the value of farm_desc.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.id
     *
     * @param id the value for farm_desc.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.farm_id
     *
     * @return the value of farm_desc.farm_id
     *
     * @mbg.generated
     */
    public Long getFarmId() {
        return farmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.farm_id
     *
     * @param farmId the value for farm_desc.farm_id
     *
     * @mbg.generated
     */
    public void setFarmId(Long farmId) {
        this.farmId = farmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.title
     *
     * @return the value of farm_desc.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.title
     *
     * @param title the value for farm_desc.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.picture
     *
     * @return the value of farm_desc.picture
     *
     * @mbg.generated
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.picture
     *
     * @param picture the value for farm_desc.picture
     *
     * @mbg.generated
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.position
     *
     * @return the value of farm_desc.position
     *
     * @mbg.generated
     */
    public Short getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.position
     *
     * @param position the value for farm_desc.position
     *
     * @mbg.generated
     */
    public void setPosition(Short position) {
        this.position = position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.is_deleted
     *
     * @return the value of farm_desc.is_deleted
     *
     * @mbg.generated
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.is_deleted
     *
     * @param isDeleted the value for farm_desc.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.is_faked
     *
     * @return the value of farm_desc.is_faked
     *
     * @mbg.generated
     */
    public Boolean getIsFaked() {
        return isFaked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.is_faked
     *
     * @param isFaked the value for farm_desc.is_faked
     *
     * @mbg.generated
     */
    public void setIsFaked(Boolean isFaked) {
        this.isFaked = isFaked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.created
     *
     * @return the value of farm_desc.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.created
     *
     * @param created the value for farm_desc.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.created_by
     *
     * @return the value of farm_desc.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.created_by
     *
     * @param createdBy the value for farm_desc.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.updated
     *
     * @return the value of farm_desc.updated
     *
     * @mbg.generated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.updated
     *
     * @param updated the value for farm_desc.updated
     *
     * @mbg.generated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.updated_by
     *
     * @return the value of farm_desc.updated_by
     *
     * @mbg.generated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.updated_by
     *
     * @param updatedBy the value for farm_desc.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column farm_desc.summary
     *
     * @return the value of farm_desc.summary
     *
     * @mbg.generated
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column farm_desc.summary
     *
     * @param summary the value for farm_desc.summary
     *
     * @mbg.generated
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
}