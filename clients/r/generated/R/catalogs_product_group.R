#' Create a new CatalogsProductGroup
#'
#' @description
#' catalog product group entity
#'
#' @docType class
#' @title CatalogsProductGroup
#' @description CatalogsProductGroup Class
#' @format An \code{R6Class} generator object
#' @field id ID of the catalog product group. character
#' @field name Name of catalog product group character [optional]
#' @field description  character [optional]
#' @field filters  \link{CatalogsProductGroupFilters}
#' @field is_featured boolean indicator of whether the product group is being featured or not character [optional]
#' @field type  \link{CatalogsProductGroupType} [optional]
#' @field status  \link{CatalogsProductGroupStatus} [optional]
#' @field created_at Unix timestamp in seconds of when catalog product group was created. integer [optional]
#' @field updated_at Unix timestamp in seconds of last time catalog product group was updated. integer [optional]
#' @field feed_id id of the catalogs feed belonging to this catalog product group character
#' @field catalog_type  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroup <- R6::R6Class(
  "CatalogsProductGroup",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `description` = NULL,
    `filters` = NULL,
    `is_featured` = NULL,
    `type` = NULL,
    `status` = NULL,
    `created_at` = NULL,
    `updated_at` = NULL,
    `feed_id` = NULL,
    `catalog_type` = NULL,
    #' Initialize a new CatalogsProductGroup class.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroup class.
    #'
    #' @param id ID of the catalog product group.
    #' @param filters filters
    #' @param feed_id id of the catalogs feed belonging to this catalog product group
    #' @param name Name of catalog product group
    #' @param description description
    #' @param is_featured boolean indicator of whether the product group is being featured or not
    #' @param type type
    #' @param status status
    #' @param created_at Unix timestamp in seconds of when catalog product group was created.
    #' @param updated_at Unix timestamp in seconds of last time catalog product group was updated.
    #' @param catalog_type catalog_type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `filters`, `feed_id`, `name` = NULL, `description` = NULL, `is_featured` = NULL, `type` = NULL, `status` = NULL, `created_at` = NULL, `updated_at` = NULL, `catalog_type` = NULL, ...) {
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
      if (!missing(`feed_id`)) {
        if (!(is.character(`feed_id`) && length(`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", `feed_id`))
        }
        self$`feed_id` <- `feed_id`
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
      if (!is.null(`is_featured`)) {
        if (!(is.logical(`is_featured`) && length(`is_featured`) == 1)) {
          stop(paste("Error! Invalid data for `is_featured`. Must be a boolean:", `is_featured`))
        }
        self$`is_featured` <- `is_featured`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
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
      if (!is.null(`catalog_type`)) {
        if (!(`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroup in JSON format
    #' @export
    toJSON = function() {
      CatalogsProductGroupObject <- list()
      if (!is.null(self$`id`)) {
        CatalogsProductGroupObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        CatalogsProductGroupObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        CatalogsProductGroupObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`filters`)) {
        CatalogsProductGroupObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      if (!is.null(self$`is_featured`)) {
        CatalogsProductGroupObject[["is_featured"]] <-
          self$`is_featured`
      }
      if (!is.null(self$`type`)) {
        CatalogsProductGroupObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`status`)) {
        CatalogsProductGroupObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`created_at`)) {
        CatalogsProductGroupObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`updated_at`)) {
        CatalogsProductGroupObject[["updated_at"]] <-
          self$`updated_at`
      }
      if (!is.null(self$`feed_id`)) {
        CatalogsProductGroupObject[["feed_id"]] <-
          self$`feed_id`
      }
      if (!is.null(self$`catalog_type`)) {
        CatalogsProductGroupObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      CatalogsProductGroupObject
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroup
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroup
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroup
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
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
        `filters_object` <- CatalogsProductGroupFilters$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      if (!is.null(this_object$`is_featured`)) {
        self$`is_featured` <- this_object$`is_featured`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- CatalogsProductGroupType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- CatalogsProductGroupStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`updated_at`)) {
        self$`updated_at` <- this_object$`updated_at`
      }
      if (!is.null(this_object$`feed_id`)) {
        self$`feed_id` <- this_object$`feed_id`
      }
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroup in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
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
        if (!is.null(self$`is_featured`)) {
          sprintf(
          '"is_featured":
            %s
                    ',
          tolower(self$`is_featured`)
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`feed_id`)) {
          sprintf(
          '"feed_id":
            "%s"
                    ',
          self$`feed_id`
          )
        },
        if (!is.null(self$`catalog_type`)) {
          sprintf(
          '"catalog_type":
            "%s"
                    ',
          self$`catalog_type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroup
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroup
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroup
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`filters` <- CatalogsProductGroupFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self$`is_featured` <- this_object$`is_featured`
      self$`type` <- CatalogsProductGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`status` <- CatalogsProductGroupStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`created_at` <- this_object$`created_at`
      self$`updated_at` <- this_object$`updated_at`
      self$`feed_id` <- this_object$`feed_id`
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self
    },
    #' Validate JSON input with respect to CatalogsProductGroup
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsProductGroup and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroup: the required field `id` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroup: the required field `filters` is missing."))
      }
      # check the required field `feed_id`
      if (!is.null(input_json$`feed_id`)) {
        if (!(is.character(input_json$`feed_id`) && length(input_json$`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", input_json$`feed_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroup: the required field `feed_id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroup
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
# CatalogsProductGroup$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroup$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroup$lock()

