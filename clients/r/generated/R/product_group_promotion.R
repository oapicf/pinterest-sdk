#' Create a new ProductGroupPromotion
#'
#' @description
#' ProductGroupPromotion Class
#'
#' @docType class
#' @title ProductGroupPromotion
#' @description ProductGroupPromotion Class
#' @format An \code{R6Class} generator object
#' @field ad_group_id ID of the ad group the product group belongs to. character [optional]
#' @field bid_in_micro_currency The bid in micro currency. integer [optional]
#' @field catalog_product_group_id ID of the catalogs product group that this product group promotion references character [optional]
#' @field catalog_product_group_name Catalogs product group name character [optional]
#' @field collections_header_type Collections ad header type character [optional]
#' @field collections_hero_destination_url Collections Hero Destination Url character [optional]
#' @field collections_hero_pin_id Hero Pin ID if this PG is promoted as a Collection character [optional]
#' @field creative_type  \link{CreativeType} [optional]
#' @field customizable_cta_type Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE character [optional]
#' @field definition The full product group definition path character [optional]
#' @field grid_click_type  \link{GridClickType} [optional]
#' @field id ID of the product group promotion. character [optional]
#' @field included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. character [optional]
#' @field is_generate_background Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. character [optional]
#' @field is_mdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog character [optional]
#' @field parent_id The parent Product Group ID of this Product Group character [optional]
#' @field preferred_media_type Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. character [optional]
#' @field relative_definition The definition of the product group, relative to its parent - an attribute name/value pair character [optional]
#' @field selected_image_tag The ad image tag selected for the product group promotion. character [optional]
#' @field selected_video_tag The ad video tag selected for the product group promotion. character [optional]
#' @field slideshow_collections_description Slideshow Collections Description character [optional]
#' @field slideshow_collections_title Slideshow Collections Title character [optional]
#' @field status  \link{EntityStatus} [optional]
#' @field tracking_url Tracking template for proudct group promotions. 4000 limit character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductGroupPromotion <- R6::R6Class(
  "ProductGroupPromotion",
  public = list(
    `ad_group_id` = NULL,
    `bid_in_micro_currency` = NULL,
    `catalog_product_group_id` = NULL,
    `catalog_product_group_name` = NULL,
    `collections_header_type` = NULL,
    `collections_hero_destination_url` = NULL,
    `collections_hero_pin_id` = NULL,
    `creative_type` = NULL,
    `customizable_cta_type` = NULL,
    `definition` = NULL,
    `grid_click_type` = NULL,
    `id` = NULL,
    `included` = NULL,
    `is_generate_background` = NULL,
    `is_mdl` = NULL,
    `parent_id` = NULL,
    `preferred_media_type` = NULL,
    `relative_definition` = NULL,
    `selected_image_tag` = NULL,
    `selected_video_tag` = NULL,
    `slideshow_collections_description` = NULL,
    `slideshow_collections_title` = NULL,
    `status` = NULL,
    `tracking_url` = NULL,

    #' @description
    #' Initialize a new ProductGroupPromotion class.
    #'
    #' @param ad_group_id ID of the ad group the product group belongs to.
    #' @param bid_in_micro_currency The bid in micro currency.
    #' @param catalog_product_group_id ID of the catalogs product group that this product group promotion references
    #' @param catalog_product_group_name Catalogs product group name
    #' @param collections_header_type Collections ad header type
    #' @param collections_hero_destination_url Collections Hero Destination Url
    #' @param collections_hero_pin_id Hero Pin ID if this PG is promoted as a Collection
    #' @param creative_type creative_type
    #' @param customizable_cta_type Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
    #' @param definition The full product group definition path
    #' @param grid_click_type grid_click_type
    #' @param id ID of the product group promotion.
    #' @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
    #' @param is_generate_background Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
    #' @param is_mdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
    #' @param parent_id The parent Product Group ID of this Product Group
    #' @param preferred_media_type Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
    #' @param relative_definition The definition of the product group, relative to its parent - an attribute name/value pair
    #' @param selected_image_tag The ad image tag selected for the product group promotion.
    #' @param selected_video_tag The ad video tag selected for the product group promotion.
    #' @param slideshow_collections_description Slideshow Collections Description
    #' @param slideshow_collections_title Slideshow Collections Title
    #' @param status status
    #' @param tracking_url Tracking template for proudct group promotions. 4000 limit
    #' @param ... Other optional arguments.
    initialize = function(`ad_group_id` = NULL, `bid_in_micro_currency` = NULL, `catalog_product_group_id` = NULL, `catalog_product_group_name` = NULL, `collections_header_type` = NULL, `collections_hero_destination_url` = NULL, `collections_hero_pin_id` = NULL, `creative_type` = NULL, `customizable_cta_type` = NULL, `definition` = NULL, `grid_click_type` = NULL, `id` = NULL, `included` = NULL, `is_generate_background` = NULL, `is_mdl` = NULL, `parent_id` = NULL, `preferred_media_type` = NULL, `relative_definition` = NULL, `selected_image_tag` = NULL, `selected_video_tag` = NULL, `slideshow_collections_description` = NULL, `slideshow_collections_title` = NULL, `status` = NULL, `tracking_url` = NULL, ...) {
      if (!is.null(`ad_group_id`)) {
        if (!(is.character(`ad_group_id`) && length(`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", `ad_group_id`))
        }
        self$`ad_group_id` <- `ad_group_id`
      }
      if (!is.null(`bid_in_micro_currency`)) {
        if (!(is.numeric(`bid_in_micro_currency`) && length(`bid_in_micro_currency`) == 1)) {
          stop(paste("Error! Invalid data for `bid_in_micro_currency`. Must be an integer:", `bid_in_micro_currency`))
        }
        self$`bid_in_micro_currency` <- `bid_in_micro_currency`
      }
      if (!is.null(`catalog_product_group_id`)) {
        if (!(is.character(`catalog_product_group_id`) && length(`catalog_product_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_product_group_id`. Must be a string:", `catalog_product_group_id`))
        }
        self$`catalog_product_group_id` <- `catalog_product_group_id`
      }
      if (!is.null(`catalog_product_group_name`)) {
        if (!(is.character(`catalog_product_group_name`) && length(`catalog_product_group_name`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_product_group_name`. Must be a string:", `catalog_product_group_name`))
        }
        self$`catalog_product_group_name` <- `catalog_product_group_name`
      }
      if (!is.null(`collections_header_type`)) {
        if (!(`collections_header_type` %in% c("SHOP_THIS_COLLECTION", "EXPLORE_THIS_COLLECTION", "NO_HEADER", "ON_SALE", "GET_DEAL"))) {
          stop(paste("Error! \"", `collections_header_type`, "\" cannot be assigned to `collections_header_type`. Must be \"SHOP_THIS_COLLECTION\", \"EXPLORE_THIS_COLLECTION\", \"NO_HEADER\", \"ON_SALE\", \"GET_DEAL\".", sep = ""))
        }
        if (!(is.character(`collections_header_type`) && length(`collections_header_type`) == 1)) {
          stop(paste("Error! Invalid data for `collections_header_type`. Must be a string:", `collections_header_type`))
        }
        self$`collections_header_type` <- `collections_header_type`
      }
      if (!is.null(`collections_hero_destination_url`)) {
        if (!(is.character(`collections_hero_destination_url`) && length(`collections_hero_destination_url`) == 1)) {
          stop(paste("Error! Invalid data for `collections_hero_destination_url`. Must be a string:", `collections_hero_destination_url`))
        }
        self$`collections_hero_destination_url` <- `collections_hero_destination_url`
      }
      if (!is.null(`collections_hero_pin_id`)) {
        if (!(is.character(`collections_hero_pin_id`) && length(`collections_hero_pin_id`) == 1)) {
          stop(paste("Error! Invalid data for `collections_hero_pin_id`. Must be a string:", `collections_hero_pin_id`))
        }
        self$`collections_hero_pin_id` <- `collections_hero_pin_id`
      }
      if (!is.null(`creative_type`)) {
        if (!(`creative_type` %in% c())) {
          stop(paste("Error! \"", `creative_type`, "\" cannot be assigned to `creative_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`creative_type`))
        self$`creative_type` <- `creative_type`
      }
      if (!is.null(`customizable_cta_type`)) {
        if (!(`customizable_cta_type` %in% c("SHOP_NOW", "BOOK_NOW", "ON_SALE", "GET_DEAL", "BUY_ONLINE_PICKUP_IN_STORE"))) {
          stop(paste("Error! \"", `customizable_cta_type`, "\" cannot be assigned to `customizable_cta_type`. Must be \"SHOP_NOW\", \"BOOK_NOW\", \"ON_SALE\", \"GET_DEAL\", \"BUY_ONLINE_PICKUP_IN_STORE\".", sep = ""))
        }
        if (!(is.character(`customizable_cta_type`) && length(`customizable_cta_type`) == 1)) {
          stop(paste("Error! Invalid data for `customizable_cta_type`. Must be a string:", `customizable_cta_type`))
        }
        self$`customizable_cta_type` <- `customizable_cta_type`
      }
      if (!is.null(`definition`)) {
        if (!(is.character(`definition`) && length(`definition`) == 1)) {
          stop(paste("Error! Invalid data for `definition`. Must be a string:", `definition`))
        }
        self$`definition` <- `definition`
      }
      if (!is.null(`grid_click_type`)) {
        if (!(`grid_click_type` %in% c())) {
          stop(paste("Error! \"", `grid_click_type`, "\" cannot be assigned to `grid_click_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`grid_click_type`))
        self$`grid_click_type` <- `grid_click_type`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`included`)) {
        if (!(is.logical(`included`) && length(`included`) == 1)) {
          stop(paste("Error! Invalid data for `included`. Must be a boolean:", `included`))
        }
        self$`included` <- `included`
      }
      if (!is.null(`is_generate_background`)) {
        if (!(is.logical(`is_generate_background`) && length(`is_generate_background`) == 1)) {
          stop(paste("Error! Invalid data for `is_generate_background`. Must be a boolean:", `is_generate_background`))
        }
        self$`is_generate_background` <- `is_generate_background`
      }
      if (!is.null(`is_mdl`)) {
        if (!(is.logical(`is_mdl`) && length(`is_mdl`) == 1)) {
          stop(paste("Error! Invalid data for `is_mdl`. Must be a boolean:", `is_mdl`))
        }
        self$`is_mdl` <- `is_mdl`
      }
      if (!is.null(`parent_id`)) {
        if (!(is.character(`parent_id`) && length(`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", `parent_id`))
        }
        self$`parent_id` <- `parent_id`
      }
      if (!is.null(`preferred_media_type`)) {
        if (!(`preferred_media_type` %in% c("VIDEO", "IMAGE"))) {
          stop(paste("Error! \"", `preferred_media_type`, "\" cannot be assigned to `preferred_media_type`. Must be \"VIDEO\", \"IMAGE\".", sep = ""))
        }
        if (!(is.character(`preferred_media_type`) && length(`preferred_media_type`) == 1)) {
          stop(paste("Error! Invalid data for `preferred_media_type`. Must be a string:", `preferred_media_type`))
        }
        self$`preferred_media_type` <- `preferred_media_type`
      }
      if (!is.null(`relative_definition`)) {
        if (!(is.character(`relative_definition`) && length(`relative_definition`) == 1)) {
          stop(paste("Error! Invalid data for `relative_definition`. Must be a string:", `relative_definition`))
        }
        self$`relative_definition` <- `relative_definition`
      }
      if (!is.null(`selected_image_tag`)) {
        if (!(is.character(`selected_image_tag`) && length(`selected_image_tag`) == 1)) {
          stop(paste("Error! Invalid data for `selected_image_tag`. Must be a string:", `selected_image_tag`))
        }
        self$`selected_image_tag` <- `selected_image_tag`
      }
      if (!is.null(`selected_video_tag`)) {
        if (!(is.character(`selected_video_tag`) && length(`selected_video_tag`) == 1)) {
          stop(paste("Error! Invalid data for `selected_video_tag`. Must be a string:", `selected_video_tag`))
        }
        self$`selected_video_tag` <- `selected_video_tag`
      }
      if (!is.null(`slideshow_collections_description`)) {
        if (!(is.character(`slideshow_collections_description`) && length(`slideshow_collections_description`) == 1)) {
          stop(paste("Error! Invalid data for `slideshow_collections_description`. Must be a string:", `slideshow_collections_description`))
        }
        self$`slideshow_collections_description` <- `slideshow_collections_description`
      }
      if (!is.null(`slideshow_collections_title`)) {
        if (!(is.character(`slideshow_collections_title`) && length(`slideshow_collections_title`) == 1)) {
          stop(paste("Error! Invalid data for `slideshow_collections_title`. Must be a string:", `slideshow_collections_title`))
        }
        self$`slideshow_collections_title` <- `slideshow_collections_title`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`tracking_url`)) {
        if (!(is.character(`tracking_url`) && length(`tracking_url`) == 1)) {
          stop(paste("Error! Invalid data for `tracking_url`. Must be a string:", `tracking_url`))
        }
        self$`tracking_url` <- `tracking_url`
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
    #' @return ProductGroupPromotion as a base R list.
    #' @examples
    #' # convert array of ProductGroupPromotion (x) to a data frame
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
    #' Convert ProductGroupPromotion to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProductGroupPromotionObject <- list()
      if (!is.null(self$`ad_group_id`)) {
        ProductGroupPromotionObject[["ad_group_id"]] <-
          self$`ad_group_id`
      }
      if (!is.null(self$`bid_in_micro_currency`)) {
        ProductGroupPromotionObject[["bid_in_micro_currency"]] <-
          self$`bid_in_micro_currency`
      }
      if (!is.null(self$`catalog_product_group_id`)) {
        ProductGroupPromotionObject[["catalog_product_group_id"]] <-
          self$`catalog_product_group_id`
      }
      if (!is.null(self$`catalog_product_group_name`)) {
        ProductGroupPromotionObject[["catalog_product_group_name"]] <-
          self$`catalog_product_group_name`
      }
      if (!is.null(self$`collections_header_type`)) {
        ProductGroupPromotionObject[["collections_header_type"]] <-
          self$`collections_header_type`
      }
      if (!is.null(self$`collections_hero_destination_url`)) {
        ProductGroupPromotionObject[["collections_hero_destination_url"]] <-
          self$`collections_hero_destination_url`
      }
      if (!is.null(self$`collections_hero_pin_id`)) {
        ProductGroupPromotionObject[["collections_hero_pin_id"]] <-
          self$`collections_hero_pin_id`
      }
      if (!is.null(self$`creative_type`)) {
        ProductGroupPromotionObject[["creative_type"]] <-
          self$`creative_type`$toSimpleType()
      }
      if (!is.null(self$`customizable_cta_type`)) {
        ProductGroupPromotionObject[["customizable_cta_type"]] <-
          self$`customizable_cta_type`
      }
      if (!is.null(self$`definition`)) {
        ProductGroupPromotionObject[["definition"]] <-
          self$`definition`
      }
      if (!is.null(self$`grid_click_type`)) {
        ProductGroupPromotionObject[["grid_click_type"]] <-
          self$`grid_click_type`$toSimpleType()
      }
      if (!is.null(self$`id`)) {
        ProductGroupPromotionObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`included`)) {
        ProductGroupPromotionObject[["included"]] <-
          self$`included`
      }
      if (!is.null(self$`is_generate_background`)) {
        ProductGroupPromotionObject[["is_generate_background"]] <-
          self$`is_generate_background`
      }
      if (!is.null(self$`is_mdl`)) {
        ProductGroupPromotionObject[["is_mdl"]] <-
          self$`is_mdl`
      }
      if (!is.null(self$`parent_id`)) {
        ProductGroupPromotionObject[["parent_id"]] <-
          self$`parent_id`
      }
      if (!is.null(self$`preferred_media_type`)) {
        ProductGroupPromotionObject[["preferred_media_type"]] <-
          self$`preferred_media_type`
      }
      if (!is.null(self$`relative_definition`)) {
        ProductGroupPromotionObject[["relative_definition"]] <-
          self$`relative_definition`
      }
      if (!is.null(self$`selected_image_tag`)) {
        ProductGroupPromotionObject[["selected_image_tag"]] <-
          self$`selected_image_tag`
      }
      if (!is.null(self$`selected_video_tag`)) {
        ProductGroupPromotionObject[["selected_video_tag"]] <-
          self$`selected_video_tag`
      }
      if (!is.null(self$`slideshow_collections_description`)) {
        ProductGroupPromotionObject[["slideshow_collections_description"]] <-
          self$`slideshow_collections_description`
      }
      if (!is.null(self$`slideshow_collections_title`)) {
        ProductGroupPromotionObject[["slideshow_collections_title"]] <-
          self$`slideshow_collections_title`
      }
      if (!is.null(self$`status`)) {
        ProductGroupPromotionObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      if (!is.null(self$`tracking_url`)) {
        ProductGroupPromotionObject[["tracking_url"]] <-
          self$`tracking_url`
      }
      return(ProductGroupPromotionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupPromotion
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupPromotion
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_group_id`)) {
        self$`ad_group_id` <- this_object$`ad_group_id`
      }
      if (!is.null(this_object$`bid_in_micro_currency`)) {
        self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      }
      if (!is.null(this_object$`catalog_product_group_id`)) {
        self$`catalog_product_group_id` <- this_object$`catalog_product_group_id`
      }
      if (!is.null(this_object$`catalog_product_group_name`)) {
        self$`catalog_product_group_name` <- this_object$`catalog_product_group_name`
      }
      if (!is.null(this_object$`collections_header_type`)) {
        if (!is.null(this_object$`collections_header_type`) && !(this_object$`collections_header_type` %in% c("SHOP_THIS_COLLECTION", "EXPLORE_THIS_COLLECTION", "NO_HEADER", "ON_SALE", "GET_DEAL"))) {
          stop(paste("Error! \"", this_object$`collections_header_type`, "\" cannot be assigned to `collections_header_type`. Must be \"SHOP_THIS_COLLECTION\", \"EXPLORE_THIS_COLLECTION\", \"NO_HEADER\", \"ON_SALE\", \"GET_DEAL\".", sep = ""))
        }
        self$`collections_header_type` <- this_object$`collections_header_type`
      }
      if (!is.null(this_object$`collections_hero_destination_url`)) {
        self$`collections_hero_destination_url` <- this_object$`collections_hero_destination_url`
      }
      if (!is.null(this_object$`collections_hero_pin_id`)) {
        self$`collections_hero_pin_id` <- this_object$`collections_hero_pin_id`
      }
      if (!is.null(this_object$`creative_type`)) {
        `creative_type_object` <- CreativeType$new()
        `creative_type_object`$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
        self$`creative_type` <- `creative_type_object`
      }
      if (!is.null(this_object$`customizable_cta_type`)) {
        if (!is.null(this_object$`customizable_cta_type`) && !(this_object$`customizable_cta_type` %in% c("SHOP_NOW", "BOOK_NOW", "ON_SALE", "GET_DEAL", "BUY_ONLINE_PICKUP_IN_STORE"))) {
          stop(paste("Error! \"", this_object$`customizable_cta_type`, "\" cannot be assigned to `customizable_cta_type`. Must be \"SHOP_NOW\", \"BOOK_NOW\", \"ON_SALE\", \"GET_DEAL\", \"BUY_ONLINE_PICKUP_IN_STORE\".", sep = ""))
        }
        self$`customizable_cta_type` <- this_object$`customizable_cta_type`
      }
      if (!is.null(this_object$`definition`)) {
        self$`definition` <- this_object$`definition`
      }
      if (!is.null(this_object$`grid_click_type`)) {
        `grid_click_type_object` <- GridClickType$new()
        `grid_click_type_object`$fromJSON(jsonlite::toJSON(this_object$`grid_click_type`, auto_unbox = TRUE, digits = NA))
        self$`grid_click_type` <- `grid_click_type_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`included`)) {
        self$`included` <- this_object$`included`
      }
      if (!is.null(this_object$`is_generate_background`)) {
        self$`is_generate_background` <- this_object$`is_generate_background`
      }
      if (!is.null(this_object$`is_mdl`)) {
        self$`is_mdl` <- this_object$`is_mdl`
      }
      if (!is.null(this_object$`parent_id`)) {
        self$`parent_id` <- this_object$`parent_id`
      }
      if (!is.null(this_object$`preferred_media_type`)) {
        if (!is.null(this_object$`preferred_media_type`) && !(this_object$`preferred_media_type` %in% c("VIDEO", "IMAGE"))) {
          stop(paste("Error! \"", this_object$`preferred_media_type`, "\" cannot be assigned to `preferred_media_type`. Must be \"VIDEO\", \"IMAGE\".", sep = ""))
        }
        self$`preferred_media_type` <- this_object$`preferred_media_type`
      }
      if (!is.null(this_object$`relative_definition`)) {
        self$`relative_definition` <- this_object$`relative_definition`
      }
      if (!is.null(this_object$`selected_image_tag`)) {
        self$`selected_image_tag` <- this_object$`selected_image_tag`
      }
      if (!is.null(this_object$`selected_video_tag`)) {
        self$`selected_video_tag` <- this_object$`selected_video_tag`
      }
      if (!is.null(this_object$`slideshow_collections_description`)) {
        self$`slideshow_collections_description` <- this_object$`slideshow_collections_description`
      }
      if (!is.null(this_object$`slideshow_collections_title`)) {
        self$`slideshow_collections_title` <- this_object$`slideshow_collections_title`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- EntityStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`tracking_url`)) {
        self$`tracking_url` <- this_object$`tracking_url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProductGroupPromotion in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupPromotion
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupPromotion
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_group_id` <- this_object$`ad_group_id`
      self$`bid_in_micro_currency` <- this_object$`bid_in_micro_currency`
      self$`catalog_product_group_id` <- this_object$`catalog_product_group_id`
      self$`catalog_product_group_name` <- this_object$`catalog_product_group_name`
      if (!is.null(this_object$`collections_header_type`) && !(this_object$`collections_header_type` %in% c("SHOP_THIS_COLLECTION", "EXPLORE_THIS_COLLECTION", "NO_HEADER", "ON_SALE", "GET_DEAL"))) {
        stop(paste("Error! \"", this_object$`collections_header_type`, "\" cannot be assigned to `collections_header_type`. Must be \"SHOP_THIS_COLLECTION\", \"EXPLORE_THIS_COLLECTION\", \"NO_HEADER\", \"ON_SALE\", \"GET_DEAL\".", sep = ""))
      }
      self$`collections_header_type` <- this_object$`collections_header_type`
      self$`collections_hero_destination_url` <- this_object$`collections_hero_destination_url`
      self$`collections_hero_pin_id` <- this_object$`collections_hero_pin_id`
      self$`creative_type` <- CreativeType$new()$fromJSON(jsonlite::toJSON(this_object$`creative_type`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`customizable_cta_type`) && !(this_object$`customizable_cta_type` %in% c("SHOP_NOW", "BOOK_NOW", "ON_SALE", "GET_DEAL", "BUY_ONLINE_PICKUP_IN_STORE"))) {
        stop(paste("Error! \"", this_object$`customizable_cta_type`, "\" cannot be assigned to `customizable_cta_type`. Must be \"SHOP_NOW\", \"BOOK_NOW\", \"ON_SALE\", \"GET_DEAL\", \"BUY_ONLINE_PICKUP_IN_STORE\".", sep = ""))
      }
      self$`customizable_cta_type` <- this_object$`customizable_cta_type`
      self$`definition` <- this_object$`definition`
      self$`grid_click_type` <- GridClickType$new()$fromJSON(jsonlite::toJSON(this_object$`grid_click_type`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`included` <- this_object$`included`
      self$`is_generate_background` <- this_object$`is_generate_background`
      self$`is_mdl` <- this_object$`is_mdl`
      self$`parent_id` <- this_object$`parent_id`
      if (!is.null(this_object$`preferred_media_type`) && !(this_object$`preferred_media_type` %in% c("VIDEO", "IMAGE"))) {
        stop(paste("Error! \"", this_object$`preferred_media_type`, "\" cannot be assigned to `preferred_media_type`. Must be \"VIDEO\", \"IMAGE\".", sep = ""))
      }
      self$`preferred_media_type` <- this_object$`preferred_media_type`
      self$`relative_definition` <- this_object$`relative_definition`
      self$`selected_image_tag` <- this_object$`selected_image_tag`
      self$`selected_video_tag` <- this_object$`selected_video_tag`
      self$`slideshow_collections_description` <- this_object$`slideshow_collections_description`
      self$`slideshow_collections_title` <- this_object$`slideshow_collections_title`
      self$`status` <- EntityStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`tracking_url` <- this_object$`tracking_url`
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductGroupPromotion and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductGroupPromotion
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`ad_group_id`, "^(AG)?\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`catalog_product_group_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`collections_hero_pin_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`parent_id`, "^\\d+$")) {
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
      if (!str_detect(self$`ad_group_id`, "^(AG)?\\d+$")) {
        invalid_fields["ad_group_id"] <- "Invalid value for `ad_group_id`, must conform to the pattern ^(AG)?\\d+$."
      }

      if (!str_detect(self$`catalog_product_group_id`, "^\\d+$")) {
        invalid_fields["catalog_product_group_id"] <- "Invalid value for `catalog_product_group_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`collections_hero_pin_id`, "^\\d+$")) {
        invalid_fields["collections_hero_pin_id"] <- "Invalid value for `collections_hero_pin_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`parent_id`, "^\\d+$")) {
        invalid_fields["parent_id"] <- "Invalid value for `parent_id`, must conform to the pattern ^\\d+$."
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
# ProductGroupPromotion$unlock()
#
## Below is an example to define the print function
# ProductGroupPromotion$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductGroupPromotion$lock()

