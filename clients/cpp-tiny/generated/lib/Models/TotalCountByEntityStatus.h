
/*
 * TotalCountByEntityStatus.h
 *
 * Breakdown of asset counts by entity status.
 */

#ifndef TINY_CPP_CLIENT_TotalCountByEntityStatus_H_
#define TINY_CPP_CLIENT_TotalCountByEntityStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Breakdown of asset counts by entity status.
 *
 *  \ingroup Models
 *
 */

class TotalCountByEntityStatus{
public:

    /*! \brief Constructor.
	 */
    TotalCountByEntityStatus();
    TotalCountByEntityStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TotalCountByEntityStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Count of ACTIVE assets
	 */
	int getACTIVE();

	/*! \brief Set Count of ACTIVE assets
	 */
	void setACTIVE(int aCTIVE);
	/*! \brief Get Count of ARCHIVED assets
	 */
	int getARCHIVED();

	/*! \brief Set Count of ARCHIVED assets
	 */
	void setARCHIVED(int aRCHIVED);
	/*! \brief Get Count of PAUSED assets
	 */
	int getPAUSED();

	/*! \brief Set Count of PAUSED assets
	 */
	void setPAUSED(int pAUSED);


    private:
    int aCTIVE{};
    int aRCHIVED{};
    int pAUSED{};
};
}

#endif /* TINY_CPP_CLIENT_TotalCountByEntityStatus_H_ */
