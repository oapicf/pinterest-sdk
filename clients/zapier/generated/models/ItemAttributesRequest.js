const utils = require('../utils/utils');
const ItemAttributesRequest_allOf_image_link = require('../models/ItemAttributesRequest_allOf_image_link');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_link`,
                label: `Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. - [${labelPrefix}ad_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}adult`,
                label: `Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest. - [${labelPrefix}adult]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}age_group`,
                label: `The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. - [${labelPrefix}age_group]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}availability`,
                label: `The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’. - [${labelPrefix}availability]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}average_review_rating`,
                label: `Average reviews for the item. Can be a number from 1-5. - [${labelPrefix}average_review_rating]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}brand`,
                label: `The brand of the product. - [${labelPrefix}brand]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}checkout_enabled`,
                label: `This attribute is not supported anymore. - [${labelPrefix}checkout_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}color`,
                label: `The primary color of the product. - [${labelPrefix}color]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}condition`,
                label: `The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. - [${labelPrefix}condition]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_0`,
                label: `<p><= 1000 characters</p> <p>Custom grouping of products.</p> - [${labelPrefix}custom_label_0]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_1`,
                label: `<p><= 1000 characters</p> <p>Custom grouping of products.</p> - [${labelPrefix}custom_label_1]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_2`,
                label: `<p><= 1000 characters</p> <p>Custom grouping of products.</p> - [${labelPrefix}custom_label_2]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_3`,
                label: `<p><= 1000 characters</p> <p>Custom grouping of products.</p> - [${labelPrefix}custom_label_3]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_4`,
                label: `<p><= 1000 characters</p> <p>Custom grouping of products.</p> - [${labelPrefix}custom_label_4]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `<p><= 10000 characters</p> <p>The description of the product.</p> - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}free_shipping_label`,
                label: `The item is free to ship. - [${labelPrefix}free_shipping_label]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}free_shipping_limit`,
                label: `The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. - [${labelPrefix}free_shipping_limit]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}gender`,
                label: `The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’. - [${labelPrefix}gender]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}google_product_category`,
                label: `The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. - [${labelPrefix}google_product_category]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}gtin`,
                label: `The unique universal product identifier. - [${labelPrefix}gtin]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `<p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p> - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}item_group_id`,
                label: `<p><= 127 characters</p> <p>The parent ID of the product.</p> - [${labelPrefix}item_group_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}last_updated_time`,
                label: `The millisecond timestamp when the item was lastly modified by the merchant. - [${labelPrefix}last_updated_time]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}link`,
                label: `<p><= 511 characters</p> <p>The landing page for the product.</p> - [${labelPrefix}link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}material`,
                label: `The material used to make the product. - [${labelPrefix}material]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}min_ad_price`,
                label: `The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars. - [${labelPrefix}min_ad_price]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}mobile_link`,
                label: `The mobile-optimized version of your landing page. Must begin with http:// or https://. - [${labelPrefix}mobile_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}mpn`,
                label: `Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. - [${labelPrefix}mpn]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}number_of_ratings`,
                label: `The number of ratings for the item. - [${labelPrefix}number_of_ratings]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}number_of_reviews`,
                label: `The number of reviews available for the item. - [${labelPrefix}number_of_reviews]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pattern`,
                label: `The description of the pattern used for the product. - [${labelPrefix}pattern]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}price`,
                label: `The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. - [${labelPrefix}price]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_type`,
                label: `<p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p> - [${labelPrefix}product_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}sale_price`,
                label: `The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars. - [${labelPrefix}sale_price]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}shipping`,
                label: `Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. - [${labelPrefix}shipping]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}shipping_height`,
                label: `The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. - [${labelPrefix}shipping_height]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}shipping_weight`,
                label: `The weight of the product. Ensure there is a space between the numeric string and the metric. - [${labelPrefix}shipping_weight]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}shipping_width`,
                label: `The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. - [${labelPrefix}shipping_width]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}size`,
                label: `The size of the product. - [${labelPrefix}size]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}size_system`,
                label: `Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’. - [${labelPrefix}size_system]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}size_type`,
                label: `Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’. - [${labelPrefix}size_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}tax`,
                label: `Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. - [${labelPrefix}tax]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `<p><= 500 characters</p> <p>The name of the product.</p> - [${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}variant_names`,
                label: `Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. - [${labelPrefix}variant_names]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}variant_values`,
                label: `Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. - [${labelPrefix}variant_values]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}additional_image_link`,
                label: `<p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p> - [${labelPrefix}additional_image_link]`,
                list: true,
                type: 'string',
            },
            ...ItemAttributesRequest_allOf_image_link.fields(`${keyPrefix}image_link`, isInput),
            {
                key: `${keyPrefix}video_link`,
                label: `<p><= 2,000 characters</p> <p>Hosted link to the product video.</p> <p>File types for linked videos must be .mp4, .mov or .m4v.</p> <p>File size cannot exceed 2GB.</p> - [${labelPrefix}video_link]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_link': bundle.inputData?.[`${keyPrefix}ad_link`],
            'adult': bundle.inputData?.[`${keyPrefix}adult`],
            'age_group': bundle.inputData?.[`${keyPrefix}age_group`],
            'availability': bundle.inputData?.[`${keyPrefix}availability`],
            'average_review_rating': bundle.inputData?.[`${keyPrefix}average_review_rating`],
            'brand': bundle.inputData?.[`${keyPrefix}brand`],
            'checkout_enabled': bundle.inputData?.[`${keyPrefix}checkout_enabled`],
            'color': bundle.inputData?.[`${keyPrefix}color`],
            'condition': bundle.inputData?.[`${keyPrefix}condition`],
            'custom_label_0': bundle.inputData?.[`${keyPrefix}custom_label_0`],
            'custom_label_1': bundle.inputData?.[`${keyPrefix}custom_label_1`],
            'custom_label_2': bundle.inputData?.[`${keyPrefix}custom_label_2`],
            'custom_label_3': bundle.inputData?.[`${keyPrefix}custom_label_3`],
            'custom_label_4': bundle.inputData?.[`${keyPrefix}custom_label_4`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'free_shipping_label': bundle.inputData?.[`${keyPrefix}free_shipping_label`],
            'free_shipping_limit': bundle.inputData?.[`${keyPrefix}free_shipping_limit`],
            'gender': bundle.inputData?.[`${keyPrefix}gender`],
            'google_product_category': bundle.inputData?.[`${keyPrefix}google_product_category`],
            'gtin': bundle.inputData?.[`${keyPrefix}gtin`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'item_group_id': bundle.inputData?.[`${keyPrefix}item_group_id`],
            'last_updated_time': bundle.inputData?.[`${keyPrefix}last_updated_time`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'material': bundle.inputData?.[`${keyPrefix}material`],
            'min_ad_price': bundle.inputData?.[`${keyPrefix}min_ad_price`],
            'mobile_link': bundle.inputData?.[`${keyPrefix}mobile_link`],
            'mpn': bundle.inputData?.[`${keyPrefix}mpn`],
            'number_of_ratings': bundle.inputData?.[`${keyPrefix}number_of_ratings`],
            'number_of_reviews': bundle.inputData?.[`${keyPrefix}number_of_reviews`],
            'pattern': bundle.inputData?.[`${keyPrefix}pattern`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'product_type': bundle.inputData?.[`${keyPrefix}product_type`],
            'sale_price': bundle.inputData?.[`${keyPrefix}sale_price`],
            'shipping': bundle.inputData?.[`${keyPrefix}shipping`],
            'shipping_height': bundle.inputData?.[`${keyPrefix}shipping_height`],
            'shipping_weight': bundle.inputData?.[`${keyPrefix}shipping_weight`],
            'shipping_width': bundle.inputData?.[`${keyPrefix}shipping_width`],
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'size_system': bundle.inputData?.[`${keyPrefix}size_system`],
            'size_type': bundle.inputData?.[`${keyPrefix}size_type`],
            'tax': bundle.inputData?.[`${keyPrefix}tax`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'variant_names': bundle.inputData?.[`${keyPrefix}variant_names`],
            'variant_values': bundle.inputData?.[`${keyPrefix}variant_values`],
            'additional_image_link': bundle.inputData?.[`${keyPrefix}additional_image_link`],
            'image_link': utils.removeIfEmpty(ItemAttributesRequest_allOf_image_link.mapping(bundle, `${keyPrefix}image_link`)),
            'video_link': bundle.inputData?.[`${keyPrefix}video_link`],
        }
    },
}
