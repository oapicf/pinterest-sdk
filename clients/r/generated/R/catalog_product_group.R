#' Create a new CatalogProductGroup
#'
#' @description
#' non-promoted catalog product group entity
#'
#' @docType class
#' @title CatalogProductGroup
#' @description CatalogProductGroup Class
#' @format An \code{R6Class} generator object
#' @field id ID of the catalog product group. character [optional]
#' @field merchant_id Merchant ID pertaining to the owner of the catalog product group. character [optional]
#' @field name Name of catalog product group character [optional]
#' @field filters Object holding a list of filters object [optional]
#' @field filter_v2 Object holding a list of filters object [optional]
#' @field type  \link{Board} [optional]
#' @field status  \link{EntityStatus} [optional]
#' @field feed_profile_id id of the feed profile belonging to this catalog product group character [optional]
#' @field created_at Unix timestamp in seconds of when catalog product group was created. integer [optional]
#' @field last_update Unix timestamp in seconds of last time catalog product group was updated. integer [optional]
#' @field product_count Amount of products in the catalog product group integer [optional]
#' @field featured_position index of the featured position of the catalog product group integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogProductGroup <- R6::R6Class(
  "CatalogProductGroup",
  public = list(
    `id` = NULL,
    `merchant_id` = NULL,
    `name` = NULL,
    `filters` = NULL,
    `filter_v2` = NULL,
    `type` = NULL,
    `status` = NULL,
    `feed_profile_id` = NULL,
    `created_at` = NULL,
    `last_update` = NULL,
    `product_count` = NULL,
    `featured_position` = NULL,
    #' Initialize a new CatalogProductGroup class.
    #'
    #' @description
    #' Initialize a new CatalogProductGroup class.
    #'
    #' @param id ID of the catalog product group.
    #' @param merchant_id Merchant ID pertaining to the owner of the catalog product group.
    #' @param name Name of catalog product group
    #' @param filters Object holding a list of filters
    #' @param filter_v2 Object holding a list of filters
    #' @param type type
    #' @param status status
    #' @param feed_profile_id id of the feed profile belonging to this catalog product group
    #' @param created_at Unix timestamp in seconds of when catalog product group was created.
    #' @param last_update Unix timestamp in seconds of last time catalog product group was updated.
    #' @param product_count Amount of products in the catalog product group
    #' @param featured_position index of the featured position of the catalog product group
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `merchant_id` = NULL, `name` = NULL, `filters` = NULL, `filter_v2` = NULL, `type` = NULL, `status` = NULL, `feed_profile_id` = NULL, `created_at` = NULL, `last_update` = NULL, `product_count` = NULL, `featured_position` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`merchant_id`)) {
        if (!(is.character(`merchant_id`) && length(`merchant_id`) == 1)) {
          stop(paste("Error! Invalid data for `merchant_id`. Must be a string:", `merchant_id`))
        }
        self$`merchant_id` <- `merchant_id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`filters`)) {
        self$`filters` <- `filters`
      }
      if (!is.null(`filter_v2`)) {
        self$`filter_v2` <- `filter_v2`
      }
      if (!is.null(`type`)) {
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
      if (!is.null(`feed_profile_id`)) {
        if (!(is.character(`feed_profile_id`) && length(`feed_profile_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_profile_id`. Must be a string:", `feed_profile_id`))
        }
        self$`feed_profile_id` <- `feed_profile_id`
      }
      if (!is.null(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!is.null(`last_update`)) {
        if (!(is.numeric(`last_update`) && length(`last_update`) == 1)) {
          stop(paste("Error! Invalid data for `last_update`. Must be an integer:", `last_update`))
        }
        self$`last_update` <- `last_update`
      }
      if (!is.null(`product_count`)) {
        if (!(is.numeric(`product_count`) && length(`product_count`) == 1)) {
          stop(paste("Error! Invalid data for `product_count`. Must be an integer:", `product_count`))
        }
        self$`product_count` <- `product_count`
      }
      if (!is.null(`featured_position`)) {
        if (!(is.numeric(`featured_position`) && length(`featured_position`) == 1)) {
          stop(paste("Error! Invalid data for `featured_position`. Must be an integer:", `featured_position`))
        }
        self$`featured_position` <- `featured_position`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogProductGroup in JSON format
    #' @export
    toJSON = function() {
      CatalogProductGroupObject <- list()
      if (!is.null(self$`id`)) {
        CatalogProductGroupObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`merchant_id`)) {
        CatalogProductGroupObject[["merchant_id"]] <-
          self$`merchant_id`
      }
      if (!is.null(self$`name`)) {
        CatalogProductGroupObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`filters`)) {
        CatalogProductGroupObject[["filters"]] <-
          self$`filters`
      }
      if (!is.null(self$`filter_v2`)) {
        CatalogProductGroupObject[["filter_v2"]] <-
          self$`filter_v2`
      }
      if (!is.null(self$`type`)) {
        CatalogProductGroupObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`status`)) {
        CatalogProductGroupObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`feed_profile_id`)) {
        CatalogProductGroupObject[["feed_profile_id"]] <-
          self$`feed_profile_id`
      }
      if (!is.null(self$`created_at`)) {
        CatalogProductGroupObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`last_update`)) {
        CatalogProductGroupObject[["last_update"]] <-
          self$`last_update`
      }
      if (!is.null(self$`product_count`)) {
        CatalogProductGroupObject[["product_count"]] <-
          self$`product_count`
      }
      if (!is.null(self$`featured_position`)) {
        CatalogProductGroupObject[["featured_position"]] <-
          self$`featured_position`
      }
      CatalogProductGroupObject
    },
    #' Deserialize JSON string into an instance of CatalogProductGroup
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogProductGroup
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogProductGroup
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`merchant_id`)) {
        self$`merchant_id` <- this_object$`merchant_id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`filters`)) {
        self$`filters` <- this_object$`filters`
      }
      if (!is.null(this_object$`filter_v2`)) {
        self$`filter_v2` <- this_object$`filter_v2`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- Board$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`feed_profile_id`)) {
        self$`feed_profile_id` <- this_object$`feed_profile_id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`last_update`)) {
        self$`last_update` <- this_object$`last_update`
      }
      if (!is.null(this_object$`product_count`)) {
        self$`product_count` <- this_object$`product_count`
      }
      if (!is.null(this_object$`featured_position`)) {
        self$`featured_position` <- this_object$`featured_position`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogProductGroup in JSON format
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
        if (!is.null(self$`merchant_id`)) {
          sprintf(
          '"merchant_id":
            "%s"
                    ',
          self$`merchant_id`
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
        if (!is.null(self$`filters`)) {
          sprintf(
          '"filters":
            "%s"
                    ',
          self$`filters`
          )
        },
        if (!is.null(self$`filter_v2`)) {
          sprintf(
          '"filter_v2":
            "%s"
                    ',
          self$`filter_v2`
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
        if (!is.null(self$`feed_profile_id`)) {
          sprintf(
          '"feed_profile_id":
            "%s"
                    ',
          self$`feed_profile_id`
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
        if (!is.null(self$`last_update`)) {
          sprintf(
          '"last_update":
            %d
                    ',
          self$`last_update`
          )
        },
        if (!is.null(self$`product_count`)) {
          sprintf(
          '"product_count":
            %d
                    ',
          self$`product_count`
          )
        },
        if (!is.null(self$`featured_position`)) {
          sprintf(
          '"featured_position":
            %d
                    ',
          self$`featured_position`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogProductGroup
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogProductGroup
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogProductGroup
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`merchant_id` <- this_object$`merchant_id`
      self$`name` <- this_object$`name`
      self$`filters` <- this_object$`filters`
      self$`filter_v2` <- this_object$`filter_v2`
      self$`type` <- Board$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`feed_profile_id` <- this_object$`feed_profile_id`
      self$`created_at` <- this_object$`created_at`
      self$`last_update` <- this_object$`last_update`
      self$`product_count` <- this_object$`product_count`
      self$`featured_position` <- this_object$`featured_position`
      self
    },
    #' Validate JSON input with respect to CatalogProductGroup
    #'
    #' @description
    #' Validate JSON input with respect to CatalogProductGroup and throw an exception if invalid
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
    #' @return String representation of CatalogProductGroup
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
      if (!str_detect(self$`merchant_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`feed_profile_id`, "^\\d+$")) {
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
      if (!str_detect(self$`merchant_id`, "^\\d+$")) {
        invalid_fields["merchant_id"] <- "Invalid value for `merchant_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`feed_profile_id`, "^\\d+$")) {
        invalid_fields["feed_profile_id"] <- "Invalid value for `feed_profile_id`, must conform to the pattern ^\\d+$."
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
# CatalogProductGroup$unlock()
#
## Below is an example to define the print function
# CatalogProductGroup$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogProductGroup$lock()

