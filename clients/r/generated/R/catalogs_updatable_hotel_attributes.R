#' Create a new CatalogsUpdatableHotelAttributes
#'
#' @description
#' CatalogsUpdatableHotelAttributes Class
#'
#' @docType class
#' @title CatalogsUpdatableHotelAttributes
#' @description CatalogsUpdatableHotelAttributes Class
#' @format An \code{R6Class} generator object
#' @field name The hotel's name. character [optional]
#' @field link Link to the product page character [optional]
#' @field description Brief description of the hotel. character [optional]
#' @field brand The brand to which this hotel belongs to. character [optional]
#' @field latitude Latitude of the hotel. numeric [optional]
#' @field longitude Longitude of the hotel. numeric [optional]
#' @field neighborhood A list of neighborhoods where the hotel is located list(character) [optional]
#' @field address  \link{CatalogsHotelAddress} [optional]
#' @field custom_label_0 Custom grouping of hotels character [optional]
#' @field custom_label_1 Custom grouping of hotels character [optional]
#' @field custom_label_2 Custom grouping of hotels character [optional]
#' @field custom_label_3 Custom grouping of hotels character [optional]
#' @field custom_label_4 Custom grouping of hotels character [optional]
#' @field category The type of property. The category can be any type of internal description desired. character [optional]
#' @field base_price Base price of the hotel room per night followed by the ISO currency code character [optional]
#' @field sale_price Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. character [optional]
#' @field guest_ratings  \link{CatalogsHotelGuestRatings} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsUpdatableHotelAttributes <- R6::R6Class(
  "CatalogsUpdatableHotelAttributes",
  public = list(
    `name` = NULL,
    `link` = NULL,
    `description` = NULL,
    `brand` = NULL,
    `latitude` = NULL,
    `longitude` = NULL,
    `neighborhood` = NULL,
    `address` = NULL,
    `custom_label_0` = NULL,
    `custom_label_1` = NULL,
    `custom_label_2` = NULL,
    `custom_label_3` = NULL,
    `custom_label_4` = NULL,
    `category` = NULL,
    `base_price` = NULL,
    `sale_price` = NULL,
    `guest_ratings` = NULL,
    #' Initialize a new CatalogsUpdatableHotelAttributes class.
    #'
    #' @description
    #' Initialize a new CatalogsUpdatableHotelAttributes class.
    #'
    #' @param name The hotel's name.
    #' @param link Link to the product page
    #' @param description Brief description of the hotel.
    #' @param brand The brand to which this hotel belongs to.
    #' @param latitude Latitude of the hotel.
    #' @param longitude Longitude of the hotel.
    #' @param neighborhood A list of neighborhoods where the hotel is located
    #' @param address address
    #' @param custom_label_0 Custom grouping of hotels
    #' @param custom_label_1 Custom grouping of hotels
    #' @param custom_label_2 Custom grouping of hotels
    #' @param custom_label_3 Custom grouping of hotels
    #' @param custom_label_4 Custom grouping of hotels
    #' @param category The type of property. The category can be any type of internal description desired.
    #' @param base_price Base price of the hotel room per night followed by the ISO currency code
    #' @param sale_price Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
    #' @param guest_ratings guest_ratings
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name` = NULL, `link` = NULL, `description` = NULL, `brand` = NULL, `latitude` = NULL, `longitude` = NULL, `neighborhood` = NULL, `address` = NULL, `custom_label_0` = NULL, `custom_label_1` = NULL, `custom_label_2` = NULL, `custom_label_3` = NULL, `custom_label_4` = NULL, `category` = NULL, `base_price` = NULL, `sale_price` = NULL, `guest_ratings` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`brand`)) {
        if (!(is.character(`brand`) && length(`brand`) == 1)) {
          stop(paste("Error! Invalid data for `brand`. Must be a string:", `brand`))
        }
        self$`brand` <- `brand`
      }
      if (!is.null(`latitude`)) {
        self$`latitude` <- `latitude`
      }
      if (!is.null(`longitude`)) {
        self$`longitude` <- `longitude`
      }
      if (!is.null(`neighborhood`)) {
        stopifnot(is.vector(`neighborhood`), length(`neighborhood`) != 0)
        sapply(`neighborhood`, function(x) stopifnot(is.character(x)))
        self$`neighborhood` <- `neighborhood`
      }
      if (!is.null(`address`)) {
        stopifnot(R6::is.R6(`address`))
        self$`address` <- `address`
      }
      if (!is.null(`custom_label_0`)) {
        if (!(is.character(`custom_label_0`) && length(`custom_label_0`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_0`. Must be a string:", `custom_label_0`))
        }
        self$`custom_label_0` <- `custom_label_0`
      }
      if (!is.null(`custom_label_1`)) {
        if (!(is.character(`custom_label_1`) && length(`custom_label_1`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_1`. Must be a string:", `custom_label_1`))
        }
        self$`custom_label_1` <- `custom_label_1`
      }
      if (!is.null(`custom_label_2`)) {
        if (!(is.character(`custom_label_2`) && length(`custom_label_2`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_2`. Must be a string:", `custom_label_2`))
        }
        self$`custom_label_2` <- `custom_label_2`
      }
      if (!is.null(`custom_label_3`)) {
        if (!(is.character(`custom_label_3`) && length(`custom_label_3`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_3`. Must be a string:", `custom_label_3`))
        }
        self$`custom_label_3` <- `custom_label_3`
      }
      if (!is.null(`custom_label_4`)) {
        if (!(is.character(`custom_label_4`) && length(`custom_label_4`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_4`. Must be a string:", `custom_label_4`))
        }
        self$`custom_label_4` <- `custom_label_4`
      }
      if (!is.null(`category`)) {
        if (!(is.character(`category`) && length(`category`) == 1)) {
          stop(paste("Error! Invalid data for `category`. Must be a string:", `category`))
        }
        self$`category` <- `category`
      }
      if (!is.null(`base_price`)) {
        if (!(is.character(`base_price`) && length(`base_price`) == 1)) {
          stop(paste("Error! Invalid data for `base_price`. Must be a string:", `base_price`))
        }
        self$`base_price` <- `base_price`
      }
      if (!is.null(`sale_price`)) {
        if (!(is.character(`sale_price`) && length(`sale_price`) == 1)) {
          stop(paste("Error! Invalid data for `sale_price`. Must be a string:", `sale_price`))
        }
        self$`sale_price` <- `sale_price`
      }
      if (!is.null(`guest_ratings`)) {
        stopifnot(R6::is.R6(`guest_ratings`))
        self$`guest_ratings` <- `guest_ratings`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsUpdatableHotelAttributes in JSON format
    #' @export
    toJSON = function() {
      CatalogsUpdatableHotelAttributesObject <- list()
      if (!is.null(self$`name`)) {
        CatalogsUpdatableHotelAttributesObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`link`)) {
        CatalogsUpdatableHotelAttributesObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`description`)) {
        CatalogsUpdatableHotelAttributesObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`brand`)) {
        CatalogsUpdatableHotelAttributesObject[["brand"]] <-
          self$`brand`
      }
      if (!is.null(self$`latitude`)) {
        CatalogsUpdatableHotelAttributesObject[["latitude"]] <-
          self$`latitude`
      }
      if (!is.null(self$`longitude`)) {
        CatalogsUpdatableHotelAttributesObject[["longitude"]] <-
          self$`longitude`
      }
      if (!is.null(self$`neighborhood`)) {
        CatalogsUpdatableHotelAttributesObject[["neighborhood"]] <-
          self$`neighborhood`
      }
      if (!is.null(self$`address`)) {
        CatalogsUpdatableHotelAttributesObject[["address"]] <-
          self$`address`$toJSON()
      }
      if (!is.null(self$`custom_label_0`)) {
        CatalogsUpdatableHotelAttributesObject[["custom_label_0"]] <-
          self$`custom_label_0`
      }
      if (!is.null(self$`custom_label_1`)) {
        CatalogsUpdatableHotelAttributesObject[["custom_label_1"]] <-
          self$`custom_label_1`
      }
      if (!is.null(self$`custom_label_2`)) {
        CatalogsUpdatableHotelAttributesObject[["custom_label_2"]] <-
          self$`custom_label_2`
      }
      if (!is.null(self$`custom_label_3`)) {
        CatalogsUpdatableHotelAttributesObject[["custom_label_3"]] <-
          self$`custom_label_3`
      }
      if (!is.null(self$`custom_label_4`)) {
        CatalogsUpdatableHotelAttributesObject[["custom_label_4"]] <-
          self$`custom_label_4`
      }
      if (!is.null(self$`category`)) {
        CatalogsUpdatableHotelAttributesObject[["category"]] <-
          self$`category`
      }
      if (!is.null(self$`base_price`)) {
        CatalogsUpdatableHotelAttributesObject[["base_price"]] <-
          self$`base_price`
      }
      if (!is.null(self$`sale_price`)) {
        CatalogsUpdatableHotelAttributesObject[["sale_price"]] <-
          self$`sale_price`
      }
      if (!is.null(self$`guest_ratings`)) {
        CatalogsUpdatableHotelAttributesObject[["guest_ratings"]] <-
          self$`guest_ratings`$toJSON()
      }
      CatalogsUpdatableHotelAttributesObject
    },
    #' Deserialize JSON string into an instance of CatalogsUpdatableHotelAttributes
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsUpdatableHotelAttributes
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsUpdatableHotelAttributes
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`brand`)) {
        self$`brand` <- this_object$`brand`
      }
      if (!is.null(this_object$`latitude`)) {
        self$`latitude` <- this_object$`latitude`
      }
      if (!is.null(this_object$`longitude`)) {
        self$`longitude` <- this_object$`longitude`
      }
      if (!is.null(this_object$`neighborhood`)) {
        self$`neighborhood` <- ApiClient$new()$deserializeObj(this_object$`neighborhood`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`address`)) {
        `address_object` <- CatalogsHotelAddress$new()
        `address_object`$fromJSON(jsonlite::toJSON(this_object$`address`, auto_unbox = TRUE, digits = NA))
        self$`address` <- `address_object`
      }
      if (!is.null(this_object$`custom_label_0`)) {
        self$`custom_label_0` <- this_object$`custom_label_0`
      }
      if (!is.null(this_object$`custom_label_1`)) {
        self$`custom_label_1` <- this_object$`custom_label_1`
      }
      if (!is.null(this_object$`custom_label_2`)) {
        self$`custom_label_2` <- this_object$`custom_label_2`
      }
      if (!is.null(this_object$`custom_label_3`)) {
        self$`custom_label_3` <- this_object$`custom_label_3`
      }
      if (!is.null(this_object$`custom_label_4`)) {
        self$`custom_label_4` <- this_object$`custom_label_4`
      }
      if (!is.null(this_object$`category`)) {
        self$`category` <- this_object$`category`
      }
      if (!is.null(this_object$`base_price`)) {
        self$`base_price` <- this_object$`base_price`
      }
      if (!is.null(this_object$`sale_price`)) {
        self$`sale_price` <- this_object$`sale_price`
      }
      if (!is.null(this_object$`guest_ratings`)) {
        `guest_ratings_object` <- CatalogsHotelGuestRatings$new()
        `guest_ratings_object`$fromJSON(jsonlite::toJSON(this_object$`guest_ratings`, auto_unbox = TRUE, digits = NA))
        self$`guest_ratings` <- `guest_ratings_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsUpdatableHotelAttributes in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`link`)) {
          sprintf(
          '"link":
            "%s"
                    ',
          self$`link`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`brand`)) {
          sprintf(
          '"brand":
            "%s"
                    ',
          self$`brand`
          )
        },
        if (!is.null(self$`latitude`)) {
          sprintf(
          '"latitude":
            %d
                    ',
          self$`latitude`
          )
        },
        if (!is.null(self$`longitude`)) {
          sprintf(
          '"longitude":
            %d
                    ',
          self$`longitude`
          )
        },
        if (!is.null(self$`neighborhood`)) {
          sprintf(
          '"neighborhood":
             [%s]
          ',
          paste(unlist(lapply(self$`neighborhood`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`address`)) {
          sprintf(
          '"address":
          %s
          ',
          jsonlite::toJSON(self$`address`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`custom_label_0`)) {
          sprintf(
          '"custom_label_0":
            "%s"
                    ',
          self$`custom_label_0`
          )
        },
        if (!is.null(self$`custom_label_1`)) {
          sprintf(
          '"custom_label_1":
            "%s"
                    ',
          self$`custom_label_1`
          )
        },
        if (!is.null(self$`custom_label_2`)) {
          sprintf(
          '"custom_label_2":
            "%s"
                    ',
          self$`custom_label_2`
          )
        },
        if (!is.null(self$`custom_label_3`)) {
          sprintf(
          '"custom_label_3":
            "%s"
                    ',
          self$`custom_label_3`
          )
        },
        if (!is.null(self$`custom_label_4`)) {
          sprintf(
          '"custom_label_4":
            "%s"
                    ',
          self$`custom_label_4`
          )
        },
        if (!is.null(self$`category`)) {
          sprintf(
          '"category":
            "%s"
                    ',
          self$`category`
          )
        },
        if (!is.null(self$`base_price`)) {
          sprintf(
          '"base_price":
            "%s"
                    ',
          self$`base_price`
          )
        },
        if (!is.null(self$`sale_price`)) {
          sprintf(
          '"sale_price":
            "%s"
                    ',
          self$`sale_price`
          )
        },
        if (!is.null(self$`guest_ratings`)) {
          sprintf(
          '"guest_ratings":
          %s
          ',
          jsonlite::toJSON(self$`guest_ratings`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsUpdatableHotelAttributes
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsUpdatableHotelAttributes
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsUpdatableHotelAttributes
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`link` <- this_object$`link`
      self$`description` <- this_object$`description`
      self$`brand` <- this_object$`brand`
      self$`latitude` <- this_object$`latitude`
      self$`longitude` <- this_object$`longitude`
      self$`neighborhood` <- ApiClient$new()$deserializeObj(this_object$`neighborhood`, "array[character]", loadNamespace("openapi"))
      self$`address` <- CatalogsHotelAddress$new()$fromJSON(jsonlite::toJSON(this_object$`address`, auto_unbox = TRUE, digits = NA))
      self$`custom_label_0` <- this_object$`custom_label_0`
      self$`custom_label_1` <- this_object$`custom_label_1`
      self$`custom_label_2` <- this_object$`custom_label_2`
      self$`custom_label_3` <- this_object$`custom_label_3`
      self$`custom_label_4` <- this_object$`custom_label_4`
      self$`category` <- this_object$`category`
      self$`base_price` <- this_object$`base_price`
      self$`sale_price` <- this_object$`sale_price`
      self$`guest_ratings` <- CatalogsHotelGuestRatings$new()$fromJSON(jsonlite::toJSON(this_object$`guest_ratings`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsUpdatableHotelAttributes
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsUpdatableHotelAttributes and throw an exception if invalid
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
    #' @return String representation of CatalogsUpdatableHotelAttributes
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
# CatalogsUpdatableHotelAttributes$unlock()
#
## Below is an example to define the print function
# CatalogsUpdatableHotelAttributes$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsUpdatableHotelAttributes$lock()

