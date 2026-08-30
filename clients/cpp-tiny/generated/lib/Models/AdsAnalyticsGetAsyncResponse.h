
/*
 * AdsAnalyticsGetAsyncResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdsAnalyticsGetAsyncResponse_H_
#define TINY_CPP_CLIENT_AdsAnalyticsGetAsyncResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BulkReportingJobStatus.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsGetAsyncResponse{
public:

    /*! \brief Constructor.
	 */
    AdsAnalyticsGetAsyncResponse();
    AdsAnalyticsGetAsyncResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsAnalyticsGetAsyncResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	BulkReportingJobStatus getReportStatus();

	/*! \brief Set 
	 */
	void setReportStatus(BulkReportingJobStatus report_status);
	/*! \brief Get 
	 */
	long getSize();

	/*! \brief Set 
	 */
	void setSize(long size);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string url);


    private:
    BulkReportingJobStatus report_status;
    long size{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_AdsAnalyticsGetAsyncResponse_H_ */
