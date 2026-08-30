
/*
 * MediaUploadParameters.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MediaUploadParameters_H_
#define TINY_CPP_CLIENT_MediaUploadParameters_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MediaUploadParameters{
public:

    /*! \brief Constructor.
	 */
    MediaUploadParameters();
    MediaUploadParameters(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MediaUploadParameters();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getContentType();

	/*! \brief Set 
	 */
	void setContentType(std::string contentType);
	/*! \brief Get 
	 */
	std::string getKey();

	/*! \brief Set 
	 */
	void setKey(std::string key);
	/*! \brief Get 
	 */
	std::string getPolicy();

	/*! \brief Set 
	 */
	void setPolicy(std::string policy);
	/*! \brief Get 
	 */
	std::string getXamzalgorithm();

	/*! \brief Set 
	 */
	void setXamzalgorithm(std::string xamzalgorithm);
	/*! \brief Get 
	 */
	std::string getXamzcredential();

	/*! \brief Set 
	 */
	void setXamzcredential(std::string xamzcredential);
	/*! \brief Get 
	 */
	std::string getXamzdate();

	/*! \brief Set 
	 */
	void setXamzdate(std::string xamzdate);
	/*! \brief Get 
	 */
	std::string getXamzsecuritytoken();

	/*! \brief Set 
	 */
	void setXamzsecuritytoken(std::string xamzsecuritytoken);
	/*! \brief Get 
	 */
	std::string getXamzsignature();

	/*! \brief Set 
	 */
	void setXamzsignature(std::string xamzsignature);


    private:
    std::string contentType{};
    std::string key{};
    std::string policy{};
    std::string xamzalgorithm{};
    std::string xamzcredential{};
    std::string xamzdate{};
    std::string xamzsecuritytoken{};
    std::string xamzsignature{};
};
}

#endif /* TINY_CPP_CLIENT_MediaUploadParameters_H_ */
