
/*
 * InnerProductCategoriesMetricsHighlights.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InnerProductCategoriesMetricsHighlights_H_
#define TINY_CPP_CLIENT_InnerProductCategoriesMetricsHighlights_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InnerProductCategoriesMetricsHighlights{
public:

    /*! \brief Constructor.
	 */
    InnerProductCategoriesMetricsHighlights();
    InnerProductCategoriesMetricsHighlights(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InnerProductCategoriesMetricsHighlights();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Month-over-month percentage change
	 */
	long getPctChangeMom();

	/*! \brief Set Month-over-month percentage change
	 */
	void setPctChangeMom(long pct_change_mom);


    private:
    long pct_change_mom{};
};
}

#endif /* TINY_CPP_CLIENT_InnerProductCategoriesMetricsHighlights_H_ */
