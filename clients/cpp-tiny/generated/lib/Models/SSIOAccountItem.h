
/*
 * SSIOAccountItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SSIOAccountItem_H_
#define TINY_CPP_CLIENT_SSIOAccountItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SSIOAccountAddress.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SSIOAccountItem{
public:

    /*! \brief Constructor.
	 */
    SSIOAccountItem();
    SSIOAccountItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SSIOAccountItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Address information that is associated with this account.
	 */
	std::list<SSIOAccountAddress> getAddresses();

	/*! \brief Set Address information that is associated with this account.
	 */
	void setAddresses(std::list <SSIOAccountAddress> addresses);
	/*! \brief Get Salesforce id for billto_info
	 */
	std::string getId();

	/*! \brief Set Salesforce id for billto_info
	 */
	void setId(std::string  id);
	/*! \brief Get Salesforce text for IO Terms and Conditions
	 */
	std::string getIoTerms();

	/*! \brief Set Salesforce text for IO Terms and Conditions
	 */
	void setIoTerms(std::string  io_terms);
	/*! \brief Get Salesforce id for IO Terms and Conditions
	 */
	std::string getIoTermsId();

	/*! \brief Set Salesforce id for IO Terms and Conditions
	 */
	void setIoTermsId(std::string  io_terms_id);
	/*! \brief Get Insertion Order Type - Pinterest Paper or Agency Paper
	 */
	std::string getIoType();

	/*! \brief Set Insertion Order Type - Pinterest Paper or Agency Paper
	 */
	void setIoType(std::string  io_type);
	/*! \brief Get Salesforce text for Rest of the World Terms and Conditions
	 */
	std::string getRowTerms();

	/*! \brief Set Salesforce text for Rest of the World Terms and Conditions
	 */
	void setRowTerms(std::string  row_terms);
	/*! \brief Get Salesforce id for Rest of the World Terms and Conditions
	 */
	std::string getRowTermsId();

	/*! \brief Set Salesforce id for Rest of the World Terms and Conditions
	 */
	void setRowTermsId(std::string  row_terms_id);
	/*! \brief Get Salesforce text for US Terms and Conditions
	 */
	std::string getUsTerms();

	/*! \brief Set Salesforce text for US Terms and Conditions
	 */
	void setUsTerms(std::string  us_terms);
	/*! \brief Get Salesforce id for US Terms and Conditions
	 */
	std::string getUsTermsId();

	/*! \brief Set Salesforce id for US Terms and Conditions
	 */
	void setUsTermsId(std::string  us_terms_id);


    private:
    std::list<SSIOAccountAddress> addresses;
    std::string id{};
    std::string io_terms{};
    std::string io_terms_id{};
    std::string io_type{};
    std::string row_terms{};
    std::string row_terms_id{};
    std::string us_terms{};
    std::string us_terms_id{};
};
}

#endif /* TINY_CPP_CLIENT_SSIOAccountItem_H_ */
