#' Create a new CatalogsHotelProductGroupCreateRequest
#'
#' @description
#' Request object for creating a hotel product group.
#'
#' @docType class
#' @title CatalogsHotelProductGroupCreateRequest
#' @description CatalogsHotelProductGroupCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field name  character
#' @field description  character [optional]
#' @field filters  \link{CatalogsHotelProductGroupFilters}
#' @field catalog_id Catalog id pertaining to the hotel product group. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelProductGroupCreateRequest <- R6::R6Class(
  "CatalogsHotelProductGroupCreateRequest",
  public = list(
    `catalog_type` = NULL,
    `name` = NULL,
    `description` = NULL,
    `filters` = NULL,
    `catalog_id` = NULL,
    #' Initialize a new CatalogsHotelProductGroupCreateRequest class.
    #'
    #' @description
    #' Initialize a new CatalogsHotelProductGroupCreateRequest class.
    #'
    #' @param catalog_type catalog_type
    #' @param name name
    #' @param filters filters
    #' @param catalog_id Catalog id pertaining to the hotel product group.
    #' @param description description
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`catalog_type`, `name`, `filters`, `catalog_id`, `description` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`filters`)) {
        stopifnot(R6::is.R6(`filters`))
        self$`filters` <- `filters`
      }
      if (!missing(`catalog_id`)) {
        if (!(is.character(`catalog_id`) && length(`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", `catalog_id`))
        }
        self$`catalog_id` <- `catalog_id`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductGroupCreateRequest in JSON format
    #' @export
    toJSON = function() {
      CatalogsHotelProductGroupCreateRequestObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsHotelProductGroupCreateRequestObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`name`)) {
        CatalogsHotelProductGroupCreateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        CatalogsHotelProductGroupCreateRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`filters`)) {
        CatalogsHotelProductGroupCreateRequestObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      if (!is.null(self$`catalog_id`)) {
        CatalogsHotelProductGroupCreateRequestObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      CatalogsHotelProductGroupCreateRequestObject
    },
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupCreateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroupCreateRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsHotelProductGroupFilters$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductGroupCreateRequest in JSON format
    #' @export
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
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
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
        if (!is.null(self$`filters`)) {
          sprintf(
          '"filters":
          %s
          ',
          jsonlite::toJSON(self$`filters`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`catalog_id`)) {
          sprintf(
          '"catalog_id":
            "%s"
                    ',
          self$`catalog_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupCreateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroupCreateRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`filters` <- CatalogsHotelProductGroupFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self$`catalog_id` <- this_object$`catalog_id`
      self
    },
    #' Validate JSON input with respect to CatalogsHotelProductGroupCreateRequest
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsHotelProductGroupCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        if (!(is.character(input_json$`catalog_type`) && length(input_json$`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", input_json$`catalog_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroupCreateRequest: the required field `catalog_type` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroupCreateRequest: the required field `name` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroupCreateRequest: the required field `filters` is missing."))
      }
      # check the required field `catalog_id`
      if (!is.null(input_json$`catalog_id`)) {
        if (!(is.character(input_json$`catalog_id`) && length(input_json$`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", input_json$`catalog_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroupCreateRequest: the required field `catalog_id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelProductGroupCreateRequest
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        return(FALSE)
      }

      # check if the required `catalog_id` is null
      if (is.null(self$`catalog_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        return(FALSE)
      }

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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        invalid_fields["filters"] <- "Non-nullable required field `filters` cannot be null."
      }

      # check if the required `catalog_id` is null
      if (is.null(self$`catalog_id`)) {
        invalid_fields["catalog_id"] <- "Non-nullable required field `catalog_id` cannot be null."
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        invalid_fields["catalog_id"] <- "Invalid value for `catalog_id`, must conform to the pattern ^\\d+$."
      }

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
# CatalogsHotelProductGroupCreateRequest$unlock()
#
## Below is an example to define the print function
# CatalogsHotelProductGroupCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelProductGroupCreateRequest$lock()

