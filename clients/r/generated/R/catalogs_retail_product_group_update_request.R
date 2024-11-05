#' Create a new CatalogsRetailProductGroupUpdateRequest
#'
#' @description
#' Request object for updating a retail product group.
#'
#' @docType class
#' @title CatalogsRetailProductGroupUpdateRequest
#' @description CatalogsRetailProductGroupUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field catalog_type Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. character [optional]
#' @field name  character [optional]
#' @field description  character [optional]
#' @field filters  \link{CatalogsProductGroupFiltersRequest} [optional]
#' @field country  \link{Country} [optional]
#' @field locale  \link{CatalogsLocale} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailProductGroupUpdateRequest <- R6::R6Class(
  "CatalogsRetailProductGroupUpdateRequest",
  public = list(
    `catalog_type` = NULL,
    `name` = NULL,
    `description` = NULL,
    `filters` = NULL,
    `country` = NULL,
    `locale` = NULL,

    #' @description
    #' Initialize a new CatalogsRetailProductGroupUpdateRequest class.
    #'
    #' @param catalog_type Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
    #' @param name name
    #' @param description description
    #' @param filters filters
    #' @param country country
    #' @param locale locale
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type` = NULL, `name` = NULL, `description` = NULL, `filters` = NULL, `country` = NULL, `locale` = NULL, ...) {
      if (!is.null(`catalog_type`)) {
        if (!(`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
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
      if (!is.null(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!is.null(`locale`)) {
        if (!(`locale` %in% c())) {
          stop(paste("Error! \"", `locale`, "\" cannot be assigned to `locale`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`locale`))
        self$`locale` <- `locale`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsRetailProductGroupUpdateRequest in JSON format
    toJSON = function() {
      CatalogsRetailProductGroupUpdateRequestObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailProductGroupUpdateRequestObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`name`)) {
        CatalogsRetailProductGroupUpdateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        CatalogsRetailProductGroupUpdateRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`filters`)) {
        CatalogsRetailProductGroupUpdateRequestObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      if (!is.null(self$`country`)) {
        CatalogsRetailProductGroupUpdateRequestObject[["country"]] <-
          self$`country`$toJSON()
      }
      if (!is.null(self$`locale`)) {
        CatalogsRetailProductGroupUpdateRequestObject[["locale"]] <-
          self$`locale`$toJSON()
      }
      CatalogsRetailProductGroupUpdateRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailProductGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailProductGroupUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
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
        `filters_object` <- CatalogsProductGroupFiltersRequest$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`locale`)) {
        `locale_object` <- CatalogsLocale$new()
        `locale_object`$fromJSON(jsonlite::toJSON(this_object$`locale`, auto_unbox = TRUE, digits = NA))
        self$`locale` <- `locale_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsRetailProductGroupUpdateRequest in JSON format
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
        if (!is.null(self$`country`)) {
          sprintf(
          '"country":
          %s
          ',
          jsonlite::toJSON(self$`country`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`locale`)) {
          sprintf(
          '"locale":
          %s
          ',
          jsonlite::toJSON(self$`locale`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailProductGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailProductGroupUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`filters` <- CatalogsProductGroupFiltersRequest$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`locale` <- CatalogsLocale$new()$fromJSON(jsonlite::toJSON(this_object$`locale`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsRetailProductGroupUpdateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailProductGroupUpdateRequest
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
# CatalogsRetailProductGroupUpdateRequest$unlock()
#
## Below is an example to define the print function
# CatalogsRetailProductGroupUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailProductGroupUpdateRequest$lock()

