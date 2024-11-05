#' Create a new CatalogsHotelListProductsByCatalogBasedFilterRequest
#'
#' @description
#' Request object to list products for a given hotel catalog_id and product group filter.
#'
#' @docType class
#' @title CatalogsHotelListProductsByCatalogBasedFilterRequest
#' @description CatalogsHotelListProductsByCatalogBasedFilterRequest Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field catalog_id Catalog id pertaining to the hotel product group. character
#' @field filters  \link{CatalogsHotelProductGroupFilters}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelListProductsByCatalogBasedFilterRequest <- R6::R6Class(
  "CatalogsHotelListProductsByCatalogBasedFilterRequest",
  public = list(
    `catalog_type` = NULL,
    `catalog_id` = NULL,
    `filters` = NULL,

    #' @description
    #' Initialize a new CatalogsHotelListProductsByCatalogBasedFilterRequest class.
    #'
    #' @param catalog_type catalog_type
    #' @param catalog_id Catalog id pertaining to the hotel product group.
    #' @param filters filters
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `catalog_id`, `filters`, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`catalog_id`)) {
        if (!(is.character(`catalog_id`) && length(`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", `catalog_id`))
        }
        self$`catalog_id` <- `catalog_id`
      }
      if (!missing(`filters`)) {
        stopifnot(R6::is.R6(`filters`))
        self$`filters` <- `filters`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelListProductsByCatalogBasedFilterRequest in JSON format
    toJSON = function() {
      CatalogsHotelListProductsByCatalogBasedFilterRequestObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsHotelListProductsByCatalogBasedFilterRequestObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`catalog_id`)) {
        CatalogsHotelListProductsByCatalogBasedFilterRequestObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      if (!is.null(self$`filters`)) {
        CatalogsHotelListProductsByCatalogBasedFilterRequestObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      CatalogsHotelListProductsByCatalogBasedFilterRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelListProductsByCatalogBasedFilterRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelListProductsByCatalogBasedFilterRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsHotelProductGroupFilters$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelListProductsByCatalogBasedFilterRequest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`catalog_type`)) {
          sprintf(
          '"catalog_type":
            "%s"
                    ',
          self$`catalog_type`
          )
        },
        if (!is.null(self$`catalog_id`)) {
          sprintf(
          '"catalog_id":
            "%s"
                    ',
          self$`catalog_id`
          )
        },
        if (!is.null(self$`filters`)) {
          sprintf(
          '"filters":
          %s
          ',
          jsonlite::toJSON(self$`filters`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelListProductsByCatalogBasedFilterRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelListProductsByCatalogBasedFilterRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`catalog_id` <- this_object$`catalog_id`
      self$`filters` <- CatalogsHotelProductGroupFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsHotelListProductsByCatalogBasedFilterRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        if (!(is.character(input_json$`catalog_type`) && length(input_json$`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", input_json$`catalog_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelListProductsByCatalogBasedFilterRequest: the required field `catalog_type` is missing."))
      }
      # check the required field `catalog_id`
      if (!is.null(input_json$`catalog_id`)) {
        if (!(is.character(input_json$`catalog_id`) && length(input_json$`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", input_json$`catalog_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelListProductsByCatalogBasedFilterRequest: the required field `catalog_id` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelListProductsByCatalogBasedFilterRequest: the required field `filters` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelListProductsByCatalogBasedFilterRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `catalog_id` is null
      if (is.null(self$`catalog_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `catalog_id` is null
      if (is.null(self$`catalog_id`)) {
        invalid_fields["catalog_id"] <- "Non-nullable required field `catalog_id` cannot be null."
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        invalid_fields["catalog_id"] <- "Invalid value for `catalog_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        invalid_fields["filters"] <- "Non-nullable required field `filters` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsHotelListProductsByCatalogBasedFilterRequest$unlock()
#
## Below is an example to define the print function
# CatalogsHotelListProductsByCatalogBasedFilterRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelListProductsByCatalogBasedFilterRequest$lock()

