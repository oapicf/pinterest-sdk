
/*
 * AmazonConnectRequest.h
 *
 * Request containing OTP and Amazon storefront info called by Amazon
 */

#ifndef TINY_CPP_CLIENT_AmazonConnectRequest_H_
#define TINY_CPP_CLIENT_AmazonConnectRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Request containing OTP and Amazon storefront info called by Amazon
 *
 *  \ingroup Models
 *
 */

class AmazonConnectRequest{
public:

    /*! \brief Constructor.
	 */
    AmazonConnectRequest();
    AmazonConnectRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AmazonConnectRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The Amazon storefront id
	 */
	std::string getAmazonStorefrontId();

	/*! \brief Set The Amazon storefront id
	 */
	void setAmazonStorefrontId(std::string  amazon_storefront_id);
	/*! \brief Get The Amazon storefront name
	 */
	std::string getAmazonStorefrontName();

	/*! \brief Set The Amazon storefront name
	 */
	void setAmazonStorefrontName(std::string  amazon_storefront_name);
	/*! \brief Get The Amazon storefront url
	 */
	std::string getAmazonStorefrontUrl();

	/*! \brief Set The Amazon storefront url
	 */
	void setAmazonStorefrontUrl(std::string  amazon_storefront_url);
	/*! \brief Get The Amazon user id
	 */
	std::string getAmazonUserId();

	/*! \brief Set The Amazon user id
	 */
	void setAmazonUserId(std::string  amazon_user_id);
	/*! \brief Get The Amazon account linking status
	 */
	bool isIsAmazonAccountLinked();

	/*! \brief Set The Amazon account linking status
	 */
	void setIsAmazonAccountLinked(bool  is_amazon_account_linked);
	/*! \brief Get The one time passcode for Pinterest-initiated linking requests
	 */
	std::string getOneTimePasscode();

	/*! \brief Set The one time passcode for Pinterest-initiated linking requests
	 */
	void setOneTimePasscode(std::string  one_time_passcode);
	/*! \brief Get The Pinterest user id for Amazon-initiated linking requests
	 */
	std::string getPinterestUserId();

	/*! \brief Set The Pinterest user id for Amazon-initiated linking requests
	 */
	void setPinterestUserId(std::string  pinterest_user_id);


    private:
    std::string amazon_storefront_id{};
    std::string amazon_storefront_name{};
    std::string amazon_storefront_url{};
    std::string amazon_user_id{};
    bool is_amazon_account_linked{};
    std::string one_time_passcode{};
    std::string pinterest_user_id{};
};
}

#endif /* TINY_CPP_CLIENT_AmazonConnectRequest_H_ */
