#' Create a new BulkUpsertRequestUpdate
#'
#' @description
#' Request for creation of entities in bulk.
#'
#' @docType class
#' @title BulkUpsertRequestUpdate
#' @description BulkUpsertRequestUpdate Class
#' @format An \code{R6Class} generator object
#' @field ad_groups  list(\link{AdGroupUpdateRequest}) [optional]
#' @field ads  list(\link{AdUpdateRequest}) [optional]
#' @field campaigns  list(\link{CampaignUpdateRequest}) [optional]
#' @field catalog_product_groups  list(\link{BulkUpsertRequestUpdateCatalogProductGroupsItems}) [optional]
#' @field keywords  list(\link{KeywordUpdateGenerated}) [optional]
#' @field labels  list(\link{LabelBulkUpdateRequest}) [optional]
#' @field product_groups  list(\link{ProductGroupPromotionUpdateRequest}) [optional]
#' @field schedules  list(\link{ScheduleUpdateRequest}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkUpsertRequestUpdate <- R6::R6Class(
  "BulkUpsertRequestUpdate",
  public = list(
    `ad_groups` = NULL,
    `ads` = NULL,
    `campaigns` = NULL,
    `catalog_product_groups` = NULL,
    `keywords` = NULL,
    `labels` = NULL,
    `product_groups` = NULL,
    `schedules` = NULL,

    #' @description
    #' Initialize a new BulkUpsertRequestUpdate class.
    #'
    #' @param ad_groups ad_groups
    #' @param ads ads
    #' @param campaigns campaigns
    #' @param catalog_product_groups catalog_product_groups
    #' @param keywords keywords
    #' @param labels labels
    #' @param product_groups product_groups
    #' @param schedules schedules
    #' @param ... Other optional arguments.
    initialize = function(`ad_groups` = NULL, `ads` = NULL, `campaigns` = NULL, `catalog_product_groups` = NULL, `keywords` = NULL, `labels` = NULL, `product_groups` = NULL, `schedules` = NULL, ...) {
      if (!is.null(`ad_groups`)) {
        stopifnot(is.vector(`ad_groups`), length(`ad_groups`) != 0)
        sapply(`ad_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`ad_groups` <- `ad_groups`
      }
      if (!is.null(`ads`)) {
        stopifnot(is.vector(`ads`), length(`ads`) != 0)
        sapply(`ads`, function(x) stopifnot(R6::is.R6(x)))
        self$`ads` <- `ads`
      }
      if (!is.null(`campaigns`)) {
        stopifnot(is.vector(`campaigns`), length(`campaigns`) != 0)
        sapply(`campaigns`, function(x) stopifnot(R6::is.R6(x)))
        self$`campaigns` <- `campaigns`
      }
      if (!is.null(`catalog_product_groups`)) {
        stopifnot(is.vector(`catalog_product_groups`), length(`catalog_product_groups`) != 0)
        sapply(`catalog_product_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`catalog_product_groups` <- `catalog_product_groups`
      }
      if (!is.null(`keywords`)) {
        stopifnot(is.vector(`keywords`), length(`keywords`) != 0)
        sapply(`keywords`, function(x) stopifnot(R6::is.R6(x)))
        self$`keywords` <- `keywords`
      }
      if (!is.null(`labels`)) {
        stopifnot(is.vector(`labels`), length(`labels`) != 0)
        sapply(`labels`, function(x) stopifnot(R6::is.R6(x)))
        self$`labels` <- `labels`
      }
      if (!is.null(`product_groups`)) {
        stopifnot(is.vector(`product_groups`), length(`product_groups`) != 0)
        sapply(`product_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`product_groups` <- `product_groups`
      }
      if (!is.null(`schedules`)) {
        stopifnot(is.vector(`schedules`), length(`schedules`) != 0)
        sapply(`schedules`, function(x) stopifnot(R6::is.R6(x)))
        self$`schedules` <- `schedules`
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
    #' @return BulkUpsertRequestUpdate as a base R list.
    #' @examples
    #' # convert array of BulkUpsertRequestUpdate (x) to a data frame
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
    #' Convert BulkUpsertRequestUpdate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BulkUpsertRequestUpdateObject <- list()
      if (!is.null(self$`ad_groups`)) {
        BulkUpsertRequestUpdateObject[["ad_groups"]] <-
          self$extractSimpleType(self$`ad_groups`)
      }
      if (!is.null(self$`ads`)) {
        BulkUpsertRequestUpdateObject[["ads"]] <-
          self$extractSimpleType(self$`ads`)
      }
      if (!is.null(self$`campaigns`)) {
        BulkUpsertRequestUpdateObject[["campaigns"]] <-
          self$extractSimpleType(self$`campaigns`)
      }
      if (!is.null(self$`catalog_product_groups`)) {
        BulkUpsertRequestUpdateObject[["catalog_product_groups"]] <-
          self$extractSimpleType(self$`catalog_product_groups`)
      }
      if (!is.null(self$`keywords`)) {
        BulkUpsertRequestUpdateObject[["keywords"]] <-
          self$extractSimpleType(self$`keywords`)
      }
      if (!is.null(self$`labels`)) {
        BulkUpsertRequestUpdateObject[["labels"]] <-
          self$extractSimpleType(self$`labels`)
      }
      if (!is.null(self$`product_groups`)) {
        BulkUpsertRequestUpdateObject[["product_groups"]] <-
          self$extractSimpleType(self$`product_groups`)
      }
      if (!is.null(self$`schedules`)) {
        BulkUpsertRequestUpdateObject[["schedules"]] <-
          self$extractSimpleType(self$`schedules`)
      }
      return(BulkUpsertRequestUpdateObject)
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
    #' Deserialize JSON string into an instance of BulkUpsertRequestUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequestUpdate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_groups`)) {
        self$`ad_groups` <- ApiClient$new()$deserializeObj(this_object$`ad_groups`, "array[AdGroupUpdateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ads`)) {
        self$`ads` <- ApiClient$new()$deserializeObj(this_object$`ads`, "array[AdUpdateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`campaigns`)) {
        self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[CampaignUpdateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`catalog_product_groups`)) {
        self$`catalog_product_groups` <- ApiClient$new()$deserializeObj(this_object$`catalog_product_groups`, "array[BulkUpsertRequestUpdateCatalogProductGroupsItems]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordUpdateGenerated]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`labels`)) {
        self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[LabelBulkUpdateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_groups`)) {
        self$`product_groups` <- ApiClient$new()$deserializeObj(this_object$`product_groups`, "array[ProductGroupPromotionUpdateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`schedules`)) {
        self$`schedules` <- ApiClient$new()$deserializeObj(this_object$`schedules`, "array[ScheduleUpdateRequest]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BulkUpsertRequestUpdate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertRequestUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequestUpdate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_groups` <- ApiClient$new()$deserializeObj(this_object$`ad_groups`, "array[AdGroupUpdateRequest]", loadNamespace("openapi"))
      self$`ads` <- ApiClient$new()$deserializeObj(this_object$`ads`, "array[AdUpdateRequest]", loadNamespace("openapi"))
      self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[CampaignUpdateRequest]", loadNamespace("openapi"))
      self$`catalog_product_groups` <- ApiClient$new()$deserializeObj(this_object$`catalog_product_groups`, "array[BulkUpsertRequestUpdateCatalogProductGroupsItems]", loadNamespace("openapi"))
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordUpdateGenerated]", loadNamespace("openapi"))
      self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[LabelBulkUpdateRequest]", loadNamespace("openapi"))
      self$`product_groups` <- ApiClient$new()$deserializeObj(this_object$`product_groups`, "array[ProductGroupPromotionUpdateRequest]", loadNamespace("openapi"))
      self$`schedules` <- ApiClient$new()$deserializeObj(this_object$`schedules`, "array[ScheduleUpdateRequest]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BulkUpsertRequestUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkUpsertRequestUpdate
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
# BulkUpsertRequestUpdate$unlock()
#
## Below is an example to define the print function
# BulkUpsertRequestUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkUpsertRequestUpdate$lock()

