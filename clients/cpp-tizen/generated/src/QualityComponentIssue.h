/*
 * QualityComponentIssue.h
 *
 * Details of an issue with a quality component.
 */

#ifndef _QualityComponentIssue_H_
#define _QualityComponentIssue_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details of an issue with a quality component.
 *
 *  \ingroup Models
 *
 */

class QualityComponentIssue : public Object {
public:
	/*! \brief Constructor.
	 */
	QualityComponentIssue();
	QualityComponentIssue(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QualityComponentIssue();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier for the issue check.
	 */
	std::string getId();

	/*! \brief Set Unique identifier for the issue check.
	 */
	void setId(std::string  id);
	/*! \brief Get Human-readable name of the issue.
	 */
	std::string getName();

	/*! \brief Set Human-readable name of the issue.
	 */
	void setName(std::string  name);
	/*! \brief Get Detailed reason for the issue.
	 */
	std::string getReason();

	/*! \brief Set Detailed reason for the issue.
	 */
	void setReason(std::string  reason);

private:
	std::string id;
	std::string name;
	std::string reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QualityComponentIssue_H_ */
