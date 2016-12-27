package com.zlebank.zplatform.cmbc.pojo;
// default package
// Generated 2015-12-11 10:54:23 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.zlebank.zplatform.cmbc.common.enums.CertifTypeEnmu;

/**
 * TTxnsWhiteList generated by hbm2java
 */
@Entity
@Table(name = "T_TXNS_WHITE_LIST")
public class PojoTxnsWhiteList implements java.io.Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1170598895865056112L;
    private long tid;
    private String bankinscode;
    private String bankname;
    private String bankaccno;
    private String bankaccname;
    private String bankacctype;
    private String certtype;
    private String certno;
    private String mobile;
    private String address;
    private String email;
    private String status;
    private String notes;
    private String remarks;

    public PojoTxnsWhiteList() {
    }

    public PojoTxnsWhiteList(long tid) {
        this.tid = tid;
    }
    public PojoTxnsWhiteList(long tid, String bankinscode, String bankname,
            String bankaccno, String bankaccname, String bankacctype,
            String certtype, String certno, String mobile, String address,
            String email, String status, String notes, String remarks) {
        this.tid = tid;
        this.bankinscode = bankinscode;
        this.bankname = bankname;
        this.bankaccno = bankaccno;
        this.bankaccname = bankaccname;
        this.bankacctype = bankacctype;
        this.certtype = certtype;
        this.certno = certno;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
        this.status = status;
        this.notes = notes;
        this.remarks = remarks;
    }
    
    public PojoTxnsWhiteList(String bankaccno, String bankaccname,String certno, String mobile){
        this.bankaccno = bankaccno;
        this.bankaccname = bankaccname;
        this.certno = certno;
        this.mobile = mobile;
    }
    
    public PojoTxnsWhiteList(PojoTxnsWithholding withholding) {
        this.bankinscode = withholding.getPayerbankinscode();
        this.bankname = withholding.getPayerbankname();
        this.bankaccno = withholding.getAccno();
        this.bankaccname = withholding.getAccname();
        this.bankacctype = withholding.getCardtype();
        this.certtype = CertifTypeEnmu.fromCmbcCode( withholding.getCerttype()).getCode();
        this.certno = withholding.getCertno();
        this.mobile = withholding.getPhone();
        this.address = "";
        this.email = "";
        this.status = "00";
    }

    @Id
    @Column(name = "TID", unique = true, nullable = false, precision = 12, scale = 0)
    public long getTid() {
        return this.tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    @Column(name = "BANKINSCODE", length = 8)
    public String getBankinscode() {
        return this.bankinscode;
    }

    public void setBankinscode(String bankinscode) {
        this.bankinscode = bankinscode;
    }

    @Column(name = "BANKNAME", length = 128)
    public String getBankname() {
        return this.bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Column(name = "BANKACCNO", length = 32)
    public String getBankaccno() {
        return this.bankaccno;
    }

    public void setBankaccno(String bankaccno) {
        this.bankaccno = bankaccno;
    }

    @Column(name = "BANKACCNAME", length = 128)
    public String getBankaccname() {
        return this.bankaccname;
    }

    public void setBankaccname(String bankaccname) {
        this.bankaccname = bankaccname;
    }

    @Column(name = "BANKACCTYPE", length = 1)
    public String getBankacctype() {
        return this.bankacctype;
    }

    public void setBankacctype(String bankacctype) {
        this.bankacctype = bankacctype;
    }

    @Column(name = "CERTTYPE", length = 4)
    public String getCerttype() {
        return this.certtype;
    }

    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }

    @Column(name = "CERTNO", length = 20)
    public String getCertno() {
        return this.certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }

    @Column(name = "MOBILE", length = 11)
    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name = "ADDRESS", length = 256)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "EMAIL", length = 128)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "STATUS", length = 2)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "NOTES", length = 512)
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Column(name = "REMARKS", length = 512)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
