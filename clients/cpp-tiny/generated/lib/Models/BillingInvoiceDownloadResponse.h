
/*
 * BillingInvoiceDownloadResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BillingInvoiceDownloadResponse_H_
#define TINY_CPP_CLIENT_BillingInvoiceDownloadResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BillingInvoiceDownloadResponse{
public:

    /*! \brief Constructor.
	 */
    BillingInvoiceDownloadResponse();
    BillingInvoiceDownloadResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BillingInvoiceDownloadResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The download url for the billing invoice
	 */
	std::string getDownloadUrl();

	/*! \brief Set The download url for the billing invoice
	 */
	void setDownloadUrl(std::string download_url);
	/*! \brief Get The billing invoice id
	 */
	std::string getId();

	/*! \brief Set The billing invoice id
	 */
	void setId(std::string id);


    private:
    std::string download_url{};
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_BillingInvoiceDownloadResponse_H_ */
