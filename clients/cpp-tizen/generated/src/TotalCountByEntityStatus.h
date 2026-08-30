/*
 * TotalCountByEntityStatus.h
 *
 * Breakdown of asset counts by entity status.
 */

#ifndef _TotalCountByEntityStatus_H_
#define _TotalCountByEntityStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Breakdown of asset counts by entity status.
 *
 *  \ingroup Models
 *
 */

class TotalCountByEntityStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	TotalCountByEntityStatus();
	TotalCountByEntityStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TotalCountByEntityStatus();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Count of ACTIVE assets
	 */
	int getACTIVE();

	/*! \brief Set Count of ACTIVE assets
	 */
	void setACTIVE(int  aCTIVE);
	/*! \brief Get Count of ARCHIVED assets
	 */
	int getARCHIVED();

	/*! \brief Set Count of ARCHIVED assets
	 */
	void setARCHIVED(int  aRCHIVED);
	/*! \brief Get Count of PAUSED assets
	 */
	int getPAUSED();

	/*! \brief Set Count of PAUSED assets
	 */
	void setPAUSED(int  pAUSED);

private:
	int aCTIVE;
	int aRCHIVED;
	int pAUSED;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TotalCountByEntityStatus_H_ */
