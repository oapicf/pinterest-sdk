/*
 * LabelCreateRequest.h
 *
 * 
 */

#ifndef _LabelCreateRequest_H_
#define _LabelCreateRequest_H_


#include <string>
#include "LabelCreateItem.h"
#include <list>
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

class LabelCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelCreateRequest();
	LabelCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Labels that you are applying to the campaign.
	 */
	std::list<LabelCreateItem> getLabels();

	/*! \brief Set Labels that you are applying to the campaign.
	 */
	void setLabels(std::list <LabelCreateItem> labels);

private:
	std::list <LabelCreateItem>labels;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabelCreateRequest_H_ */
