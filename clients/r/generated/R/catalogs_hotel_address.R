#' Create a new CatalogsHotelAddress
#'
#' @description
#' CatalogsHotelAddress Class
#'
#' @docType class
#' @title CatalogsHotelAddress
#' @description CatalogsHotelAddress Class
#' @format An \code{R6Class} generator object
#' @field addr1 Primary street address of hotel. character [optional]
#' @field city City where the hotel is located. character [optional]
#' @field region State, county, province, where the hotel is located. character [optional]
#' @field country Country where the hotel is located. character [optional]
#' @field postal_code Required for countries with a postal code system. Postal or zip code of the hotel. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelAddress <- R6::R6Class(
  "CatalogsHotelAddress",
  public = list(
    `addr1` = NULL,
    `city` = NULL,
    `region` = NULL,
    `country` = NULL,
    `postal_code` = NULL,
    #' Initialize a new CatalogsHotelAddress class.
    #'
    #' @description
    #' Initialize a new CatalogsHotelAddress class.
    #'
    #' @param addr1 Primary street address of hotel.
    #' @param city City where the hotel is located.
    #' @param region State, county, province, where the hotel is located.
    #' @param country Country where the hotel is located.
    #' @param postal_code Required for countries with a postal code system. Postal or zip code of the hotel.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`addr1` = NULL, `city` = NULL, `region` = NULL, `country` = NULL, `postal_code` = NULL, ...) {
      if (!is.null(`addr1`)) {
        if (!(is.character(`addr1`) && length(`addr1`) == 1)) {
          stop(paste("Error! Invalid data for `addr1`. Must be a string:", `addr1`))
        }
        self$`addr1` <- `addr1`
      }
      if (!is.null(`city`)) {
        if (!(is.character(`city`) && length(`city`) == 1)) {
          stop(paste("Error! Invalid data for `city`. Must be a string:", `city`))
        }
        self$`city` <- `city`
      }
      if (!is.null(`region`)) {
        if (!(is.character(`region`) && length(`region`) == 1)) {
          stop(paste("Error! Invalid data for `region`. Must be a string:", `region`))
        }
        self$`region` <- `region`
      }
      if (!is.null(`country`)) {
        if (!(is.character(`country`) && length(`country`) == 1)) {
          stop(paste("Error! Invalid data for `country`. Must be a string:", `country`))
        }
        self$`country` <- `country`
      }
      if (!is.null(`postal_code`)) {
        if (!(is.character(`postal_code`) && length(`postal_code`) == 1)) {
          stop(paste("Error! Invalid data for `postal_code`. Must be a string:", `postal_code`))
        }
        self$`postal_code` <- `postal_code`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelAddress in JSON format
    #' @export
    toJSON = function() {
      CatalogsHotelAddressObject <- list()
      if (!is.null(self$`addr1`)) {
        CatalogsHotelAddressObject[["addr1"]] <-
          self$`addr1`
      }
      if (!is.null(self$`city`)) {
        CatalogsHotelAddressObject[["city"]] <-
          self$`city`
      }
      if (!is.null(self$`region`)) {
        CatalogsHotelAddressObject[["region"]] <-
          self$`region`
      }
      if (!is.null(self$`country`)) {
        CatalogsHotelAddressObject[["country"]] <-
          self$`country`
      }
      if (!is.null(self$`postal_code`)) {
        CatalogsHotelAddressObject[["postal_code"]] <-
          self$`postal_code`
      }
      CatalogsHotelAddressObject
    },
    #' Deserialize JSON string into an instance of CatalogsHotelAddress
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelAddress
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelAddress
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`addr1`)) {
        self$`addr1` <- this_object$`addr1`
      }
      if (!is.null(this_object$`city`)) {
        self$`city` <- this_object$`city`
      }
      if (!is.null(this_object$`region`)) {
        self$`region` <- this_object$`region`
      }
      if (!is.null(this_object$`country`)) {
        self$`country` <- this_object$`country`
      }
      if (!is.null(this_object$`postal_code`)) {
        self$`postal_code` <- this_object$`postal_code`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelAddress in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`addr1`)) {
          sprintf(
          '"addr1":
            "%s"
                    ',
          self$`addr1`
          )
        },
        if (!is.null(self$`city`)) {
          sprintf(
          '"city":
            "%s"
                    ',
          self$`city`
          )
        },
        if (!is.null(self$`region`)) {
          sprintf(
          '"region":
            "%s"
                    ',
          self$`region`
          )
        },
        if (!is.null(self$`country`)) {
          sprintf(
          '"country":
            "%s"
                    ',
          self$`country`
          )
        },
        if (!is.null(self$`postal_code`)) {
          sprintf(
          '"postal_code":
            "%s"
                    ',
          self$`postal_code`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsHotelAddress
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelAddress
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelAddress
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`addr1` <- this_object$`addr1`
      self$`city` <- this_object$`city`
      self$`region` <- this_object$`region`
      self$`country` <- this_object$`country`
      self$`postal_code` <- this_object$`postal_code`
      self
    },
    #' Validate JSON input with respect to CatalogsHotelAddress
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsHotelAddress and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelAddress
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsHotelAddress$unlock()
#
## Below is an example to define the print function
# CatalogsHotelAddress$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelAddress$lock()

