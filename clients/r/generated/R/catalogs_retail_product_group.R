#' Create a new CatalogsRetailProductGroup
#'
#' @description
#' CatalogsRetailProductGroup Class
#'
#' @docType class
#' @title CatalogsRetailProductGroup
#' @description CatalogsRetailProductGroup Class
#' @format An \code{R6Class} generator object
#' @field catalog_id Catalog id pertaining to the retail product group. character
#' @field catalog_type  character
#' @field country  character [optional]
#' @field created_at Unix timestamp in seconds of when catalog product group was created. integer [optional]
#' @field description  character [optional]
#' @field feed_id id of the catalogs feed belonging to this catalog product group character
#' @field filters  \link{CatalogsProductGroupFilters}
#' @field id ID of the catalog product group. character
#' @field is_featured boolean indicator of whether the product group is being featured or not character [optional]
#' @field locale  character [optional]
#' @field name Name of catalog product group character [optional]
#' @field status  \link{CatalogsProductGroupStatus} [optional]
#' @field type  \link{CatalogsProductGroupType}
#' @field updated_at Unix timestamp in seconds of last time catalog product group was updated. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailProductGroup <- R6::R6Class(
  "CatalogsRetailProductGroup",
  public = list(
    `catalog_id` = NULL,
    `catalog_type` = NULL,
    `country` = NULL,
    `created_at` = NULL,
    `description` = NULL,
    `feed_id` = NULL,
    `filters` = NULL,
    `id` = NULL,
    `is_featured` = NULL,
    `locale` = NULL,
    `name` = NULL,
    `status` = NULL,
    `type` = NULL,
    `updated_at` = NULL,

    #' @description
    #' Initialize a new CatalogsRetailProductGroup class.
    #'
    #' @param catalog_id Catalog id pertaining to the retail product group.
    #' @param catalog_type catalog_type
    #' @param feed_id id of the catalogs feed belonging to this catalog product group
    #' @param filters filters
    #' @param id ID of the catalog product group.
    #' @param type type
    #' @param country country
    #' @param created_at Unix timestamp in seconds of when catalog product group was created.
    #' @param description description
    #' @param is_featured boolean indicator of whether the product group is being featured or not
    #' @param locale locale
    #' @param name Name of catalog product group
    #' @param status status
    #' @param updated_at Unix timestamp in seconds of last time catalog product group was updated.
    #' @param ... Other optional arguments.
    initialize = function(`catalog_id`, `catalog_type`, `feed_id`, `filters`, `id`, `type`, `country` = NULL, `created_at` = NULL, `description` = NULL, `is_featured` = NULL, `locale` = NULL, `name` = NULL, `status` = NULL, `updated_at` = NULL, ...) {
      if (!missing(`catalog_id`)) {
        if (!(is.character(`catalog_id`) && length(`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", `catalog_id`))
        }
        self$`catalog_id` <- `catalog_id`
      }
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`feed_id`)) {
        if (!(is.character(`feed_id`) && length(`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", `feed_id`))
        }
        self$`feed_id` <- `feed_id`
      }
      if (!missing(`filters`)) {
        stopifnot(R6::is.R6(`filters`))
        self$`filters` <- `filters`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`country`)) {
        if (!(is.character(`country`) && length(`country`) == 1)) {
          stop(paste("Error! Invalid data for `country`. Must be a string:", `country`))
        }
        self$`country` <- `country`
      }
      if (!is.null(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
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
      if (!is.null(`locale`)) {
        if (!(is.character(`locale`) && length(`locale`) == 1)) {
          stop(paste("Error! Invalid data for `locale`. Must be a string:", `locale`))
        }
        self$`locale` <- `locale`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`updated_at`)) {
        if (!(is.numeric(`updated_at`) && length(`updated_at`) == 1)) {
          stop(paste("Error! Invalid data for `updated_at`. Must be an integer:", `updated_at`))
        }
        self$`updated_at` <- `updated_at`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CatalogsRetailProductGroup as a base R list.
    #' @examples
    #' # convert array of CatalogsRetailProductGroup (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CatalogsRetailProductGroup to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsRetailProductGroupObject <- list()
      if (!is.null(self$`catalog_id`)) {
        CatalogsRetailProductGroupObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailProductGroupObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`country`)) {
        CatalogsRetailProductGroupObject[["country"]] <-
          self$`country`
      }
      if (!is.null(self$`created_at`)) {
        CatalogsRetailProductGroupObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`description`)) {
        CatalogsRetailProductGroupObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`feed_id`)) {
        CatalogsRetailProductGroupObject[["feed_id"]] <-
          self$`feed_id`
      }
      if (!is.null(self$`filters`)) {
        CatalogsRetailProductGroupObject[["filters"]] <-
          self$`filters`$toSimpleType()
      }
      if (!is.null(self$`id`)) {
        CatalogsRetailProductGroupObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`is_featured`)) {
        CatalogsRetailProductGroupObject[["is_featured"]] <-
          self$`is_featured`
      }
      if (!is.null(self$`locale`)) {
        CatalogsRetailProductGroupObject[["locale"]] <-
          self$`locale`
      }
      if (!is.null(self$`name`)) {
        CatalogsRetailProductGroupObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`status`)) {
        CatalogsRetailProductGroupObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      if (!is.null(self$`type`)) {
        CatalogsRetailProductGroupObject[["type"]] <-
          self$`type`$toSimpleType()
      }
      if (!is.null(self$`updated_at`)) {
        CatalogsRetailProductGroupObject[["updated_at"]] <-
          self$`updated_at`
      }
      return(CatalogsRetailProductGroupObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailProductGroup
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailProductGroup
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`country`)) {
        self$`country` <- this_object$`country`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`feed_id`)) {
        self$`feed_id` <- this_object$`feed_id`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsProductGroupFilters$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`is_featured`)) {
        self$`is_featured` <- this_object$`is_featured`
      }
      if (!is.null(this_object$`locale`)) {
        self$`locale` <- this_object$`locale`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- CatalogsProductGroupStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- CatalogsProductGroupType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`updated_at`)) {
        self$`updated_at` <- this_object$`updated_at`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsRetailProductGroup in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailProductGroup
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailProductGroup
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_id` <- this_object$`catalog_id`
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`country` <- this_object$`country`
      self$`created_at` <- this_object$`created_at`
      self$`description` <- this_object$`description`
      self$`feed_id` <- this_object$`feed_id`
      self$`filters` <- CatalogsProductGroupFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`is_featured` <- this_object$`is_featured`
      self$`locale` <- this_object$`locale`
      self$`name` <- this_object$`name`
      self$`status` <- CatalogsProductGroupStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`type` <- CatalogsProductGroupType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`updated_at` <- this_object$`updated_at`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsRetailProductGroup and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_id`
      if (!is.null(input_json$`catalog_id`)) {
        if (!(is.character(input_json$`catalog_id`) && length(input_json$`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", input_json$`catalog_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroup: the required field `catalog_id` is missing."))
      }
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        if (!(is.character(input_json$`catalog_type`) && length(input_json$`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", input_json$`catalog_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroup: the required field `catalog_type` is missing."))
      }
      # check the required field `feed_id`
      if (!is.null(input_json$`feed_id`)) {
        if (!(is.character(input_json$`feed_id`) && length(input_json$`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", input_json$`feed_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroup: the required field `feed_id` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroup: the required field `filters` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroup: the required field `id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroup: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailProductGroup
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_id` is null
      if (is.null(self$`catalog_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      if (!str_detect(self$`feed_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `catalog_id` is null
      if (is.null(self$`catalog_id`)) {
        invalid_fields["catalog_id"] <- "Non-nullable required field `catalog_id` cannot be null."
      }

      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        invalid_fields["catalog_id"] <- "Invalid value for `catalog_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      if (!str_detect(self$`feed_id`, "^\\d+$")) {
        invalid_fields["feed_id"] <- "Invalid value for `feed_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        invalid_fields["filters"] <- "Non-nullable required field `filters` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# CatalogsRetailProductGroup$unlock()
#
## Below is an example to define the print function
# CatalogsRetailProductGroup$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailProductGroup$lock()

