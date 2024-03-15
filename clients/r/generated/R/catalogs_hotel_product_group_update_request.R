#' Create a new CatalogsHotelProductGroupUpdateRequest
#'
#' @description
#' Request object for updating a hotel product group.
#'
#' @docType class
#' @title CatalogsHotelProductGroupUpdateRequest
#' @description CatalogsHotelProductGroupUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character [optional]
#' @field name  character [optional]
#' @field description  character [optional]
#' @field filters  \link{CatalogsHotelProductGroupFilters} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelProductGroupUpdateRequest <- R6::R6Class(
  "CatalogsHotelProductGroupUpdateRequest",
  public = list(
    `catalog_type` = NULL,
    `name` = NULL,
    `description` = NULL,
    `filters` = NULL,
    #' Initialize a new CatalogsHotelProductGroupUpdateRequest class.
    #'
    #' @description
    #' Initialize a new CatalogsHotelProductGroupUpdateRequest class.
    #'
    #' @param catalog_type catalog_type
    #' @param name name
    #' @param description description
    #' @param filters filters
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`catalog_type` = NULL, `name` = NULL, `description` = NULL, `filters` = NULL, ...) {
      if (!is.null(`catalog_type`)) {
        if (!(`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`filters`)) {
        stopifnot(R6::is.R6(`filters`))
        self$`filters` <- `filters`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductGroupUpdateRequest in JSON format
    #' @export
    toJSON = function() {
      CatalogsHotelProductGroupUpdateRequestObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsHotelProductGroupUpdateRequestObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`name`)) {
        CatalogsHotelProductGroupUpdateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        CatalogsHotelProductGroupUpdateRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`filters`)) {
        CatalogsHotelProductGroupUpdateRequestObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      CatalogsHotelProductGroupUpdateRequestObject
    },
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupUpdateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroupUpdateRequest
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
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductGroupUpdateRequest in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupUpdateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroupUpdateRequest
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
      self
    },
    #' Validate JSON input with respect to CatalogsHotelProductGroupUpdateRequest
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsHotelProductGroupUpdateRequest and throw an exception if invalid
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
    #' @return String representation of CatalogsHotelProductGroupUpdateRequest
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
# CatalogsHotelProductGroupUpdateRequest$unlock()
#
## Below is an example to define the print function
# CatalogsHotelProductGroupUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelProductGroupUpdateRequest$lock()

