#' Create a new BulkUpsertRequestCreate
#'
#' @description
#' Request for creation of entities in bulk.
#'
#' @docType class
#' @title BulkUpsertRequestCreate
#' @description BulkUpsertRequestCreate Class
#' @format An \code{R6Class} generator object
#' @field ad_groups  list(\link{AdGroupCreateRequest}) [optional]
#' @field ads  list(\link{AdCreateRequest}) [optional]
#' @field campaigns  list(\link{CampaignCreateRequest}) [optional]
#' @field catalog_product_groups  list(\link{BulkUpsertRequestCreateCatalogProductGroupsItems}) [optional]
#' @field keywords  list(\link{KeywordsRequest}) [optional]
#' @field labels  list(\link{LabelBulkCreateRequest}) [optional]
#' @field product_groups  list(\link{ProductGroupPromotionCreateRequest}) [optional]
#' @field schedules  list(\link{ScheduleCreateRequest}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkUpsertRequestCreate <- R6::R6Class(
  "BulkUpsertRequestCreate",
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
    #' Initialize a new BulkUpsertRequestCreate class.
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
    #' @return BulkUpsertRequestCreate as a base R list.
    #' @examples
    #' # convert array of BulkUpsertRequestCreate (x) to a data frame
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
    #' Convert BulkUpsertRequestCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BulkUpsertRequestCreateObject <- list()
      if (!is.null(self$`ad_groups`)) {
        BulkUpsertRequestCreateObject[["ad_groups"]] <-
          self$extractSimpleType(self$`ad_groups`)
      }
      if (!is.null(self$`ads`)) {
        BulkUpsertRequestCreateObject[["ads"]] <-
          self$extractSimpleType(self$`ads`)
      }
      if (!is.null(self$`campaigns`)) {
        BulkUpsertRequestCreateObject[["campaigns"]] <-
          self$extractSimpleType(self$`campaigns`)
      }
      if (!is.null(self$`catalog_product_groups`)) {
        BulkUpsertRequestCreateObject[["catalog_product_groups"]] <-
          self$extractSimpleType(self$`catalog_product_groups`)
      }
      if (!is.null(self$`keywords`)) {
        BulkUpsertRequestCreateObject[["keywords"]] <-
          self$extractSimpleType(self$`keywords`)
      }
      if (!is.null(self$`labels`)) {
        BulkUpsertRequestCreateObject[["labels"]] <-
          self$extractSimpleType(self$`labels`)
      }
      if (!is.null(self$`product_groups`)) {
        BulkUpsertRequestCreateObject[["product_groups"]] <-
          self$extractSimpleType(self$`product_groups`)
      }
      if (!is.null(self$`schedules`)) {
        BulkUpsertRequestCreateObject[["schedules"]] <-
          self$extractSimpleType(self$`schedules`)
      }
      return(BulkUpsertRequestCreateObject)
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
    #' Deserialize JSON string into an instance of BulkUpsertRequestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequestCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_groups`)) {
        self$`ad_groups` <- ApiClient$new()$deserializeObj(this_object$`ad_groups`, "array[AdGroupCreateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ads`)) {
        self$`ads` <- ApiClient$new()$deserializeObj(this_object$`ads`, "array[AdCreateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`campaigns`)) {
        self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[CampaignCreateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`catalog_product_groups`)) {
        self$`catalog_product_groups` <- ApiClient$new()$deserializeObj(this_object$`catalog_product_groups`, "array[BulkUpsertRequestCreateCatalogProductGroupsItems]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordsRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`labels`)) {
        self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[LabelBulkCreateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_groups`)) {
        self$`product_groups` <- ApiClient$new()$deserializeObj(this_object$`product_groups`, "array[ProductGroupPromotionCreateRequest]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`schedules`)) {
        self$`schedules` <- ApiClient$new()$deserializeObj(this_object$`schedules`, "array[ScheduleCreateRequest]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BulkUpsertRequestCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkUpsertRequestCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkUpsertRequestCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_groups` <- ApiClient$new()$deserializeObj(this_object$`ad_groups`, "array[AdGroupCreateRequest]", loadNamespace("openapi"))
      self$`ads` <- ApiClient$new()$deserializeObj(this_object$`ads`, "array[AdCreateRequest]", loadNamespace("openapi"))
      self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[CampaignCreateRequest]", loadNamespace("openapi"))
      self$`catalog_product_groups` <- ApiClient$new()$deserializeObj(this_object$`catalog_product_groups`, "array[BulkUpsertRequestCreateCatalogProductGroupsItems]", loadNamespace("openapi"))
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordsRequest]", loadNamespace("openapi"))
      self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[LabelBulkCreateRequest]", loadNamespace("openapi"))
      self$`product_groups` <- ApiClient$new()$deserializeObj(this_object$`product_groups`, "array[ProductGroupPromotionCreateRequest]", loadNamespace("openapi"))
      self$`schedules` <- ApiClient$new()$deserializeObj(this_object$`schedules`, "array[ScheduleCreateRequest]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BulkUpsertRequestCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkUpsertRequestCreate
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
# BulkUpsertRequestCreate$unlock()
#
## Below is an example to define the print function
# BulkUpsertRequestCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkUpsertRequestCreate$lock()

