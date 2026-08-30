
/*
 * LeadsExports.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LeadsExports_H_
#define TINY_CPP_CLIENT_LeadsExports_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LeadsExports{
public:

    /*! \brief Constructor.
	 */
    LeadsExports();
    LeadsExports(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadsExports();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get ID for the leads export job.
	 */
	std::string getLeadsExportId();

	/*! \brief Set ID for the leads export job.
	 */
	void setLeadsExportId(std::string leads_export_id);


    private:
    std::string leads_export_id{};
};
}

#endif /* TINY_CPP_CLIENT_LeadsExports_H_ */
