
/*
 * LeadsExportResponseData.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LeadsExportResponseData_H_
#define TINY_CPP_CLIENT_LeadsExportResponseData_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LeadsExportStatus.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LeadsExportResponseData{
public:

    /*! \brief Constructor.
	 */
    LeadsExportResponseData();
    LeadsExportResponseData(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadsExportResponseData();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getDownloadUrl();

	/*! \brief Set 
	 */
	void setDownloadUrl(std::string  download_url);
	/*! \brief Get 
	 */
	LeadsExportStatus getExportStatus();

	/*! \brief Set 
	 */
	void setExportStatus(LeadsExportStatus  export_status);


    private:
    std::string download_url{};
    LeadsExportStatus export_status;
};
}

#endif /* TINY_CPP_CLIENT_LeadsExportResponseData_H_ */
