package com.tneciv.dockerboot.entity;

public class Boot {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boot.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boot.boot
     *
     * @mbg.generated
     */
    private String boot;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boot.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boot.desc
     *
     * @mbg.generated
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    public Boot(Integer id, String boot, String name, String desc) {
        this.id = id;
        this.boot = boot;
        this.name = name;
        this.desc = desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    public Boot() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boot.id
     *
     * @return the value of boot.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boot.id
     *
     * @param id the value for boot.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boot.boot
     *
     * @return the value of boot.boot
     *
     * @mbg.generated
     */
    public String getBoot() {
        return boot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boot.boot
     *
     * @param boot the value for boot.boot
     *
     * @mbg.generated
     */
    public void setBoot(String boot) {
        this.boot = boot == null ? null : boot.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boot.name
     *
     * @return the value of boot.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boot.name
     *
     * @param name the value for boot.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boot.desc
     *
     * @return the value of boot.desc
     *
     * @mbg.generated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boot.desc
     *
     * @param desc the value for boot.desc
     *
     * @mbg.generated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}