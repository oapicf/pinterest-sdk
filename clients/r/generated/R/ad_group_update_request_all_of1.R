#' Create a new AdGroupUpdateRequestAllOf1
#'
#' @description
#' AdGroupUpdateRequestAllOf1 Class
#'
#' @docType class
#' @title AdGroupUpdateRequestAllOf1
#' @description AdGroupUpdateRequestAllOf1 Class
#' @format An \code{R6Class} generator object
#' @field bid_multiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. numeric [optional]
#' @field id Ad group ID. character
#' @field targeting_spec_operations <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul> list(\link{TargetingSpecOperations}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdGroupUpdateRequestAllOf1 <- R6::R6Class(
  "AdGroupUpdateRequestAllOf1",
  public = list(
    `bid_multiplier` = NULL,
    `id` = NULL,
    `targeting_spec_operations` = NULL,

    #' @description
    #' Initialize a new AdGroupUpdateRequestAllOf1 class.
    #'
    #' @param id Ad group ID.
    #' @param bid_multiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
    #' @param targeting_spec_operations <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>
    #' @param ... Other optional arguments.
    initialize = function(`id`, `bid_multiplier` = NULL, `targeting_spec_operations` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`bid_multiplier`)) {
        self$`bid_multiplier` <- `bid_multiplier`
      }
      if (!is.null(`targeting_spec_operations`)) {
        stopifnot(is.vector(`targeting_spec_operations`), length(`targeting_spec_operations`) != 0)
        sapply(`targeting_spec_operations`, function(x) stopifnot(R6::is.R6(x)))
        self$`targeting_spec_operations` <- `targeting_spec_operations`
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
    #' @return AdGroupUpdateRequestAllOf1 as a base R list.
    #' @examples
    #' # convert array of AdGroupUpdateRequestAllOf1 (x) to a data frame
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
    #' Convert AdGroupUpdateRequestAllOf1 to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdGroupUpdateRequestAllOf1Object <- list()
      if (!is.null(self$`bid_multiplier`)) {
        AdGroupUpdateRequestAllOf1Object[["bid_multiplier"]] <-
          self$`bid_multiplier`
      }
      if (!is.null(self$`id`)) {
        AdGroupUpdateRequestAllOf1Object[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`targeting_spec_operations`)) {
        AdGroupUpdateRequestAllOf1Object[["targeting_spec_operations"]] <-
          self$extractSimpleType(self$`targeting_spec_operations`)
      }
      return(AdGroupUpdateRequestAllOf1Object)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupUpdateRequestAllOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupUpdateRequestAllOf1
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bid_multiplier`)) {
        self$`bid_multiplier` <- this_object$`bid_multiplier`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`targeting_spec_operations`)) {
        self$`targeting_spec_operations` <- ApiClient$new()$deserializeObj(this_object$`targeting_spec_operations`, "array[TargetingSpecOperations]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdGroupUpdateRequestAllOf1 in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdGroupUpdateRequestAllOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdGroupUpdateRequestAllOf1
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bid_multiplier` <- this_object$`bid_multiplier`
      self$`id` <- this_object$`id`
      self$`targeting_spec_operations` <- ApiClient$new()$deserializeObj(this_object$`targeting_spec_operations`, "array[TargetingSpecOperations]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdGroupUpdateRequestAllOf1 and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdGroupUpdateRequestAllOf1: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdGroupUpdateRequestAllOf1
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`bid_multiplier` > 10) {
        return(FALSE)
      }
      if (self$`bid_multiplier` < 0) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
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
      if (self$`bid_multiplier` > 10) {
        invalid_fields["bid_multiplier"] <- "Invalid value for `bid_multiplier`, must be smaller than or equal to 10."
      }
      if (self$`bid_multiplier` < 0) {
        invalid_fields["bid_multiplier"] <- "Invalid value for `bid_multiplier`, must be bigger than or equal to 0."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# AdGroupUpdateRequestAllOf1$unlock()
#
## Below is an example to define the print function
# AdGroupUpdateRequestAllOf1$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdGroupUpdateRequestAllOf1$lock()

