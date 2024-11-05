#' Create a new CatalogsCreativeAssetsProductGroupUpdateRequest
#'
#' @description
#' Request object for updating a creative assets product group.
#'
#' @docType class
#' @title CatalogsCreativeAssetsProductGroupUpdateRequest
#' @description CatalogsCreativeAssetsProductGroupUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character [optional]
#' @field name  character [optional]
#' @field description  character [optional]
#' @field filters  \link{CatalogsCreativeAssetsProductGroupFilters} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreativeAssetsProductGroupUpdateRequest <- R6::R6Class(
  "CatalogsCreativeAssetsProductGroupUpdateRequest",
  public = list(
    `catalog_type` = NULL,
    `name` = NULL,
    `description` = NULL,
    `filters` = NULL,

    #' @description
    #' Initialize a new CatalogsCreativeAssetsProductGroupUpdateRequest class.
    #'
    #' @param catalog_type catalog_type
    #' @param name name
    #' @param description description
    #' @param filters filters
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type` = NULL, `name` = NULL, `description` = NULL, `filters` = NULL, ...) {
      if (!is.null(`catalog_type`)) {
        if (!(`catalog_type` %in% c("CREATIVE_ASSETS"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
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

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreativeAssetsProductGroupUpdateRequest in JSON format
    toJSON = function() {
      CatalogsCreativeAssetsProductGroupUpdateRequestObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsCreativeAssetsProductGroupUpdateRequestObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`name`)) {
        CatalogsCreativeAssetsProductGroupUpdateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        CatalogsCreativeAssetsProductGroupUpdateRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`filters`)) {
        CatalogsCreativeAssetsProductGroupUpdateRequestObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      CatalogsCreativeAssetsProductGroupUpdateRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsProductGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsProductGroupUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("CREATIVE_ASSETS"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
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
        `filters_object` <- CatalogsCreativeAssetsProductGroupFilters$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreativeAssetsProductGroupUpdateRequest in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsProductGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsProductGroupUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("CREATIVE_ASSETS"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`filters` <- CatalogsCreativeAssetsProductGroupFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsCreativeAssetsProductGroupUpdateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreativeAssetsProductGroupUpdateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# CatalogsCreativeAssetsProductGroupUpdateRequest$unlock()
#
## Below is an example to define the print function
# CatalogsCreativeAssetsProductGroupUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreativeAssetsProductGroupUpdateRequest$lock()

