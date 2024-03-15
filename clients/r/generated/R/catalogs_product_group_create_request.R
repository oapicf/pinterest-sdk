#' Create a new CatalogsProductGroupCreateRequest
#'
#' @description
#' Request object for creating a product group.
#'
#' @docType class
#' @title CatalogsProductGroupCreateRequest
#' @description CatalogsProductGroupCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field name  character
#' @field description  character [optional]
#' @field is_featured boolean indicator of whether the product group is being featured or not character [optional]
#' @field filters  \link{CatalogsProductGroupFiltersRequest}
#' @field feed_id Catalog Feed id pertaining to the catalog product group. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupCreateRequest <- R6::R6Class(
  "CatalogsProductGroupCreateRequest",
  public = list(
    `name` = NULL,
    `description` = NULL,
    `is_featured` = NULL,
    `filters` = NULL,
    `feed_id` = NULL,
    #' Initialize a new CatalogsProductGroupCreateRequest class.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroupCreateRequest class.
    #'
    #' @param name name
    #' @param filters filters
    #' @param feed_id Catalog Feed id pertaining to the catalog product group.
    #' @param description description
    #' @param is_featured boolean indicator of whether the product group is being featured or not. Default to FALSE.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `filters`, `feed_id`, `description` = NULL, `is_featured` = FALSE, ...) {
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
      if (!missing(`feed_id`)) {
        if (!(is.character(`feed_id`) && length(`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", `feed_id`))
        }
        self$`feed_id` <- `feed_id`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`is_featured`)) {
        if (!(is.logical(`is_featured`) && length(`is_featured`) == 1)) {
          stop(paste("Error! Invalid data for `is_featured`. Must be a boolean:", `is_featured`))
        }
        self$`is_featured` <- `is_featured`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupCreateRequest in JSON format
    #' @export
    toJSON = function() {
      CatalogsProductGroupCreateRequestObject <- list()
      if (!is.null(self$`name`)) {
        CatalogsProductGroupCreateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        CatalogsProductGroupCreateRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`is_featured`)) {
        CatalogsProductGroupCreateRequestObject[["is_featured"]] <-
          self$`is_featured`
      }
      if (!is.null(self$`filters`)) {
        CatalogsProductGroupCreateRequestObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      if (!is.null(self$`feed_id`)) {
        CatalogsProductGroupCreateRequestObject[["feed_id"]] <-
          self$`feed_id`
      }
      CatalogsProductGroupCreateRequestObject
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupCreateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupCreateRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`is_featured`)) {
        self$`is_featured` <- this_object$`is_featured`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsProductGroupFiltersRequest$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      if (!is.null(this_object$`feed_id`)) {
        self$`feed_id` <- this_object$`feed_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupCreateRequest in JSON format
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
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`is_featured`)) {
          sprintf(
          '"is_featured":
            %s
                    ',
          tolower(self$`is_featured`)
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
        if (!is.null(self$`feed_id`)) {
          sprintf(
          '"feed_id":
            "%s"
                    ',
          self$`feed_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupCreateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupCreateRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`is_featured` <- this_object$`is_featured`
      self$`filters` <- CatalogsProductGroupFiltersRequest$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self$`feed_id` <- this_object$`feed_id`
      self
    },
    #' Validate JSON input with respect to CatalogsProductGroupCreateRequest
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupCreateRequest: the required field `name` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupCreateRequest: the required field `filters` is missing."))
      }
      # check the required field `feed_id`
      if (!is.null(input_json$`feed_id`)) {
        if (!(is.character(input_json$`feed_id`) && length(input_json$`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", input_json$`feed_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupCreateRequest: the required field `feed_id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupCreateRequest
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        return(FALSE)
      }

      # check if the required `feed_id` is null
      if (is.null(self$`feed_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`feed_id`, "^\\d+$")) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        invalid_fields["filters"] <- "Non-nullable required field `filters` cannot be null."
      }

      # check if the required `feed_id` is null
      if (is.null(self$`feed_id`)) {
        invalid_fields["feed_id"] <- "Non-nullable required field `feed_id` cannot be null."
      }

      if (!str_detect(self$`feed_id`, "^\\d+$")) {
        invalid_fields["feed_id"] <- "Invalid value for `feed_id`, must conform to the pattern ^\\d+$."
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
# CatalogsProductGroupCreateRequest$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupCreateRequest$lock()

