/*
 * DynamicTitlesGetStatus.h
 *
 * 
 */

#ifndef _DynamicTitlesGetStatus_H_
#define _DynamicTitlesGetStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DynamicTitlesGetStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	DynamicTitlesGetStatus();
	DynamicTitlesGetStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DynamicTitlesGetStatus();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The count of generated titles.
	 */
	int getGeneratedCount();

	/*! \brief Set The count of generated titles.
	 */
	void setGeneratedCount(int  generated_count);
	/*! \brief Get Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
	 */
	bool getIsReady();

	/*! \brief Set Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
	 */
	void setIsReady(bool  is_ready);
	/*! \brief Get The count of advertiser reviewed titles.
	 */
	int getReviewedCount();

	/*! \brief Set The count of advertiser reviewed titles.
	 */
	void setReviewedCount(int  reviewed_count);

private:
	int generated_count;
	bool is_ready;
	int reviewed_count;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DynamicTitlesGetStatus_H_ */
