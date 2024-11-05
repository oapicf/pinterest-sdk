#' Create a new CatalogsRetailListProductsByCatalogBasedFilterRequest
#'
#' @description
#' Request object to list products for a given retail catalog_id and product group filter.
#'
#' @docType class
#' @title CatalogsRetailListProductsByCatalogBasedFilterRequest
#' @description CatalogsRetailListProductsByCatalogBasedFilterRequest Class
#' @format An \code{R6Class} generator object
#' @field catalog_type Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. character
#' @field catalog_id Catalog id pertaining to the retail product group. character
#' @field filters  \link{CatalogsProductGroupFilters}
#' @field country  \link{Country}
#' @field locale  \link{CatalogsLocale}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailListProductsByCatalogBasedFilterRequest <- R6::R6Class(
  "CatalogsRetailListProductsByCatalogBasedFilterRequest",
  public = list(
    `catalog_type` = NULL,
    `catalog_id` = NULL,
    `filters` = NULL,
    `country` = NULL,
    `locale` = NULL,

    #' @description
    #' Initialize a new CatalogsRetailListProductsByCatalogBasedFilterRequest class.
    #'
    #' @param catalog_type Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
    #' @param catalog_id Catalog id pertaining to the retail product group.
    #' @param filters filters
    #' @param country country
    #' @param locale locale
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `catalog_id`, `filters`, `country`, `locale`, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
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
      if (!missing(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!missing(`locale`)) {
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
    #' @return CatalogsRetailListProductsByCatalogBasedFilterRequest in JSON format
    toJSON = function() {
      CatalogsRetailListProductsByCatalogBasedFilterRequestObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailListProductsByCatalogBasedFilterRequestObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`catalog_id`)) {
        CatalogsRetailListProductsByCatalogBasedFilterRequestObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      if (!is.null(self$`filters`)) {
        CatalogsRetailListProductsByCatalogBasedFilterRequestObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      if (!is.null(self$`country`)) {
        CatalogsRetailListProductsByCatalogBasedFilterRequestObject[["country"]] <-
          self$`country`$toJSON()
      }
      if (!is.null(self$`locale`)) {
        CatalogsRetailListProductsByCatalogBasedFilterRequestObject[["locale"]] <-
          self$`locale`$toJSON()
      }
      CatalogsRetailListProductsByCatalogBasedFilterRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailListProductsByCatalogBasedFilterRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailListProductsByCatalogBasedFilterRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsProductGroupFilters$new()
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
    #' @return CatalogsRetailListProductsByCatalogBasedFilterRequest in JSON format
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
    #' Deserialize JSON string into an instance of CatalogsRetailListProductsByCatalogBasedFilterRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailListProductsByCatalogBasedFilterRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`catalog_id` <- this_object$`catalog_id`
      self$`filters` <- CatalogsProductGroupFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`locale` <- CatalogsLocale$new()$fromJSON(jsonlite::toJSON(this_object$`locale`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsRetailListProductsByCatalogBasedFilterRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailListProductsByCatalogBasedFilterRequest: the required field `catalog_type` is missing."))
      }
      # check the required field `catalog_id`
      if (!is.null(input_json$`catalog_id`)) {
        if (!(is.character(input_json$`catalog_id`) && length(input_json$`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", input_json$`catalog_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailListProductsByCatalogBasedFilterRequest: the required field `catalog_id` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailListProductsByCatalogBasedFilterRequest: the required field `filters` is missing."))
      }
      # check the required field `country`
      if (!is.null(input_json$`country`)) {
        stopifnot(R6::is.R6(input_json$`country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailListProductsByCatalogBasedFilterRequest: the required field `country` is missing."))
      }
      # check the required field `locale`
      if (!is.null(input_json$`locale`)) {
        stopifnot(R6::is.R6(input_json$`locale`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailListProductsByCatalogBasedFilterRequest: the required field `locale` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailListProductsByCatalogBasedFilterRequest
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

      # check if the required `country` is null
      if (is.null(self$`country`)) {
        return(FALSE)
      }

      # check if the required `locale` is null
      if (is.null(self$`locale`)) {
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

      # check if the required `country` is null
      if (is.null(self$`country`)) {
        invalid_fields["country"] <- "Non-nullable required field `country` cannot be null."
      }

      # check if the required `locale` is null
      if (is.null(self$`locale`)) {
        invalid_fields["locale"] <- "Non-nullable required field `locale` cannot be null."
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
# CatalogsRetailListProductsByCatalogBasedFilterRequest$unlock()
#
## Below is an example to define the print function
# CatalogsRetailListProductsByCatalogBasedFilterRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailListProductsByCatalogBasedFilterRequest$lock()

