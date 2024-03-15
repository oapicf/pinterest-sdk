#' Create a new CatalogsUpdateRetailItem
#'
#' @description
#' An item to be updated
#'
#' @docType class
#' @title CatalogsUpdateRetailItem
#' @description CatalogsUpdateRetailItem Class
#' @format An \code{R6Class} generator object
#' @field item_id The catalog item id in the merchant namespace character
#' @field operation  character
#' @field attributes  \link{UpdatableItemAttributes}
#' @field update_mask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. list(\link{UpdateMaskFieldType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsUpdateRetailItem <- R6::R6Class(
  "CatalogsUpdateRetailItem",
  public = list(
    `item_id` = NULL,
    `operation` = NULL,
    `attributes` = NULL,
    `update_mask` = NULL,
    #' Initialize a new CatalogsUpdateRetailItem class.
    #'
    #' @description
    #' Initialize a new CatalogsUpdateRetailItem class.
    #'
    #' @param item_id The catalog item id in the merchant namespace
    #' @param operation operation
    #' @param attributes attributes
    #' @param update_mask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`item_id`, `operation`, `attributes`, `update_mask` = NULL, ...) {
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c("CREATE", "UPDATE", "UPSERT", "DELETE"))) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\", \"UPDATE\", \"UPSERT\", \"DELETE\".", sep = ""))
        }
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
      }
      if (!missing(`attributes`)) {
        stopifnot(R6::is.R6(`attributes`))
        self$`attributes` <- `attributes`
      }
      if (!is.null(`update_mask`)) {
        stopifnot(is.vector(`update_mask`), length(`update_mask`) != 0)
        sapply(`update_mask`, function(x) stopifnot(R6::is.R6(x)))
        self$`update_mask` <- `update_mask`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsUpdateRetailItem in JSON format
    #' @export
    toJSON = function() {
      CatalogsUpdateRetailItemObject <- list()
      if (!is.null(self$`item_id`)) {
        CatalogsUpdateRetailItemObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`operation`)) {
        CatalogsUpdateRetailItemObject[["operation"]] <-
          self$`operation`
      }
      if (!is.null(self$`attributes`)) {
        CatalogsUpdateRetailItemObject[["attributes"]] <-
          self$`attributes`$toJSON()
      }
      if (!is.null(self$`update_mask`)) {
        CatalogsUpdateRetailItemObject[["update_mask"]] <-
          lapply(self$`update_mask`, function(x) x$toJSON())
      }
      CatalogsUpdateRetailItemObject
    },
    #' Deserialize JSON string into an instance of CatalogsUpdateRetailItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsUpdateRetailItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsUpdateRetailItem
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE", "UPDATE", "UPSERT", "DELETE"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\", \"UPDATE\", \"UPSERT\", \"DELETE\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
      }
      if (!is.null(this_object$`attributes`)) {
        `attributes_object` <- UpdatableItemAttributes$new()
        `attributes_object`$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
        self$`attributes` <- `attributes_object`
      }
      if (!is.null(this_object$`update_mask`)) {
        self$`update_mask` <- ApiClient$new()$deserializeObj(this_object$`update_mask`, "array[UpdateMaskFieldType]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsUpdateRetailItem in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`item_id`)) {
          sprintf(
          '"item_id":
            "%s"
                    ',
          self$`item_id`
          )
        },
        if (!is.null(self$`operation`)) {
          sprintf(
          '"operation":
            "%s"
                    ',
          self$`operation`
          )
        },
        if (!is.null(self$`attributes`)) {
          sprintf(
          '"attributes":
          %s
          ',
          jsonlite::toJSON(self$`attributes`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`update_mask`)) {
          sprintf(
          '"update_mask":
          [%s]
',
          paste(sapply(self$`update_mask`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsUpdateRetailItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsUpdateRetailItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsUpdateRetailItem
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_id` <- this_object$`item_id`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE", "UPDATE", "UPSERT", "DELETE"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\", \"UPDATE\", \"UPSERT\", \"DELETE\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self$`attributes` <- UpdatableItemAttributes$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self$`update_mask` <- ApiClient$new()$deserializeObj(this_object$`update_mask`, "array[UpdateMaskFieldType]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CatalogsUpdateRetailItem
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsUpdateRetailItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsUpdateRetailItem: the required field `item_id` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsUpdateRetailItem: the required field `operation` is missing."))
      }
      # check the required field `attributes`
      if (!is.null(input_json$`attributes`)) {
        stopifnot(R6::is.R6(input_json$`attributes`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsUpdateRetailItem: the required field `attributes` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsUpdateRetailItem
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
      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        return(FALSE)
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        return(FALSE)
      }

      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
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
      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
      }

      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
        invalid_fields["attributes"] <- "Non-nullable required field `attributes` cannot be null."
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
# CatalogsUpdateRetailItem$unlock()
#
## Below is an example to define the print function
# CatalogsUpdateRetailItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsUpdateRetailItem$lock()

