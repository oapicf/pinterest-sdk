/*
 * LeadsExports.h
 *
 * 
 */

#ifndef _LeadsExports_H_
#define _LeadsExports_H_


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

class LeadsExports : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadsExports();
	LeadsExports(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadsExports();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID for the leads export job.
	 */
	std::string getLeadsExportId();

	/*! \brief Set ID for the leads export job.
	 */
	void setLeadsExportId(std::string  leads_export_id);

private:
	std::string leads_export_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadsExports_H_ */
