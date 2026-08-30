
/*
 * DynamicTitlesDownloadCSV.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DynamicTitlesDownloadCSV_H_
#define TINY_CPP_CLIENT_DynamicTitlesDownloadCSV_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DynamicTitlesDownloadCSV{
public:

    /*! \brief Constructor.
	 */
    DynamicTitlesDownloadCSV();
    DynamicTitlesDownloadCSV(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DynamicTitlesDownloadCSV();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Pre-signed S3 URL to download the CSV file.
	 */
	std::string getDownloadUrl();

	/*! \brief Set Pre-signed S3 URL to download the CSV file.
	 */
	void setDownloadUrl(std::string download_url);


    private:
    std::string download_url{};
};
}

#endif /* TINY_CPP_CLIENT_DynamicTitlesDownloadCSV_H_ */
