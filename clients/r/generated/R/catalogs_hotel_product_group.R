#' Create a new CatalogsHotelProductGroup
#'
#' @description
#' CatalogsHotelProductGroup Class
#'
#' @docType class
#' @title CatalogsHotelProductGroup
#' @description CatalogsHotelProductGroup Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field id ID of the hotel product group. character
#' @field name Name of hotel product group character [optional]
#' @field description  character [optional]
#' @field filters  \link{CatalogsHotelProductGroupFilters}
#' @field created_at Unix timestamp in seconds of when catalog product group was created. integer [optional]
#' @field updated_at Unix timestamp in seconds of last time catalog product group was updated. integer [optional]
#' @field catalog_id  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelProductGroup <- R6::R6Class(
  "CatalogsHotelProductGroup",
  public = list(
    `catalog_type` = NULL,
    `id` = NULL,
    `name` = NULL,
    `description` = NULL,
    `filters` = NULL,
    `created_at` = NULL,
    `updated_at` = NULL,
    `catalog_id` = NULL,
    #' Initialize a new CatalogsHotelProductGroup class.
    #'
    #' @description
    #' Initialize a new CatalogsHotelProductGroup class.
    #'
    #' @param catalog_type catalog_type
    #' @param id ID of the hotel product group.
    #' @param filters filters
    #' @param catalog_id catalog_id
    #' @param name Name of hotel product group
    #' @param description description
    #' @param created_at Unix timestamp in seconds of when catalog product group was created.
    #' @param updated_at Unix timestamp in seconds of last time catalog product group was updated.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`catalog_type`, `id`, `filters`, `catalog_id`, `name` = NULL, `description` = NULL, `created_at` = NULL, `updated_at` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
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
      if (!is.null(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!is.null(`updated_at`)) {
        if (!(is.numeric(`updated_at`) && length(`updated_at`) == 1)) {
          stop(paste("Error! Invalid data for `updated_at`. Must be an integer:", `updated_at`))
        }
        self$`updated_at` <- `updated_at`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductGroup in JSON format
    #' @export
    toJSON = function() {
      CatalogsHotelProductGroupObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsHotelProductGroupObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`id`)) {
        CatalogsHotelProductGroupObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        CatalogsHotelProductGroupObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        CatalogsHotelProductGroupObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`filters`)) {
        CatalogsHotelProductGroupObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      if (!is.null(self$`created_at`)) {
        CatalogsHotelProductGroupObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`updated_at`)) {
        CatalogsHotelProductGroupObject[["updated_at"]] <-
          self$`updated_at`
      }
      if (!is.null(self$`catalog_id`)) {
        CatalogsHotelProductGroupObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      CatalogsHotelProductGroupObject
    },
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroup
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroup
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroup
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
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
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`updated_at`)) {
        self$`updated_at` <- this_object$`updated_at`
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
    #' @return CatalogsHotelProductGroup in JSON format
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
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
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
        if (!is.null(self$`created_at`)) {
          sprintf(
          '"created_at":
            %d
                    ',
          self$`created_at`
          )
        },
        if (!is.null(self$`updated_at`)) {
          sprintf(
          '"updated_at":
            %d
                    ',
          self$`updated_at`
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
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroup
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroup
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroup
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`filters` <- CatalogsHotelProductGroupFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self$`created_at` <- this_object$`created_at`
      self$`updated_at` <- this_object$`updated_at`
      self$`catalog_id` <- this_object$`catalog_id`
      self
    },
    #' Validate JSON input with respect to CatalogsHotelProductGroup
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsHotelProductGroup and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroup: the required field `catalog_type` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroup: the required field `id` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroup: the required field `filters` is missing."))
      }
      # check the required field `catalog_id`
      if (!is.null(input_json$`catalog_id`)) {
        if (!(is.character(input_json$`catalog_id`) && length(input_json$`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", input_json$`catalog_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroup: the required field `catalog_id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelProductGroup
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

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
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

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# CatalogsHotelProductGroup$unlock()
#
## Below is an example to define the print function
# CatalogsHotelProductGroup$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelProductGroup$lock()

