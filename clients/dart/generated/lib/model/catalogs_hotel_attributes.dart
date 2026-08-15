//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelAttributes {
  /// Returns a new [CatalogsHotelAttributes] instance.
  CatalogsHotelAttributes({
    this.address,
    this.basePrice,
    this.brand,
    this.category,
    this.customLabel0,
    this.customLabel1,
    this.customLabel2,
    this.customLabel3,
    this.customLabel4,
    this.description,
    this.guestRatings,
    this.latitude,
    this.link,
    this.longitude,
    this.name,
    this.neighborhood = const [],
    this.salePrice,
    this.additionalImageLink = const [],
    this.mainImage,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsHotelAddress? address;

  /// Base price of the hotel room per night followed by the ISO currency code
  String? basePrice;

  /// The brand to which this hotel belongs to.
  String? brand;

  /// The type of property. The category can be any type of internal description desired.
  String? category;

  /// Custom grouping of hotels
  String? customLabel0;

  /// Custom grouping of hotels
  String? customLabel1;

  /// Custom grouping of hotels
  String? customLabel2;

  /// Custom grouping of hotels
  String? customLabel3;

  /// Custom grouping of hotels
  String? customLabel4;

  /// Brief description of the hotel.
  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsHotelGuestRatings? guestRatings;

  /// Latitude of the hotel.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? latitude;

  /// Link to the product page
  String? link;

  /// Longitude of the hotel.
  num? longitude;

  /// The hotel's name.
  String? name;

  /// A list of neighborhoods where the hotel is located
  List<String>? neighborhood;

  /// Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  String? salePrice;

  /// <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
  List<String>? additionalImageLink;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsHotelAttributesAllOfMainImage? mainImage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelAttributes &&
    other.address == address &&
    other.basePrice == basePrice &&
    other.brand == brand &&
    other.category == category &&
    other.customLabel0 == customLabel0 &&
    other.customLabel1 == customLabel1 &&
    other.customLabel2 == customLabel2 &&
    other.customLabel3 == customLabel3 &&
    other.customLabel4 == customLabel4 &&
    other.description == description &&
    other.guestRatings == guestRatings &&
    other.latitude == latitude &&
    other.link == link &&
    other.longitude == longitude &&
    other.name == name &&
    _deepEquality.equals(other.neighborhood, neighborhood) &&
    other.salePrice == salePrice &&
    _deepEquality.equals(other.additionalImageLink, additionalImageLink) &&
    other.mainImage == mainImage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (address == null ? 0 : address!.hashCode) +
    (basePrice == null ? 0 : basePrice!.hashCode) +
    (brand == null ? 0 : brand!.hashCode) +
    (category == null ? 0 : category!.hashCode) +
    (customLabel0 == null ? 0 : customLabel0!.hashCode) +
    (customLabel1 == null ? 0 : customLabel1!.hashCode) +
    (customLabel2 == null ? 0 : customLabel2!.hashCode) +
    (customLabel3 == null ? 0 : customLabel3!.hashCode) +
    (customLabel4 == null ? 0 : customLabel4!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (guestRatings == null ? 0 : guestRatings!.hashCode) +
    (latitude == null ? 0 : latitude!.hashCode) +
    (link == null ? 0 : link!.hashCode) +
    (longitude == null ? 0 : longitude!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (neighborhood == null ? 0 : neighborhood!.hashCode) +
    (salePrice == null ? 0 : salePrice!.hashCode) +
    (additionalImageLink == null ? 0 : additionalImageLink!.hashCode) +
    (mainImage == null ? 0 : mainImage!.hashCode);

  @override
  String toString() => 'CatalogsHotelAttributes[address=$address, basePrice=$basePrice, brand=$brand, category=$category, customLabel0=$customLabel0, customLabel1=$customLabel1, customLabel2=$customLabel2, customLabel3=$customLabel3, customLabel4=$customLabel4, description=$description, guestRatings=$guestRatings, latitude=$latitude, link=$link, longitude=$longitude, name=$name, neighborhood=$neighborhood, salePrice=$salePrice, additionalImageLink=$additionalImageLink, mainImage=$mainImage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.address != null) {
      json[r'address'] = this.address;
    } else {
      json[r'address'] = null;
    }
    if (this.basePrice != null) {
      json[r'base_price'] = this.basePrice;
    } else {
      json[r'base_price'] = null;
    }
    if (this.brand != null) {
      json[r'brand'] = this.brand;
    } else {
      json[r'brand'] = null;
    }
    if (this.category != null) {
      json[r'category'] = this.category;
    } else {
      json[r'category'] = null;
    }
    if (this.customLabel0 != null) {
      json[r'custom_label_0'] = this.customLabel0;
    } else {
      json[r'custom_label_0'] = null;
    }
    if (this.customLabel1 != null) {
      json[r'custom_label_1'] = this.customLabel1;
    } else {
      json[r'custom_label_1'] = null;
    }
    if (this.customLabel2 != null) {
      json[r'custom_label_2'] = this.customLabel2;
    } else {
      json[r'custom_label_2'] = null;
    }
    if (this.customLabel3 != null) {
      json[r'custom_label_3'] = this.customLabel3;
    } else {
      json[r'custom_label_3'] = null;
    }
    if (this.customLabel4 != null) {
      json[r'custom_label_4'] = this.customLabel4;
    } else {
      json[r'custom_label_4'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.guestRatings != null) {
      json[r'guest_ratings'] = this.guestRatings;
    } else {
      json[r'guest_ratings'] = null;
    }
    if (this.latitude != null) {
      json[r'latitude'] = this.latitude;
    } else {
      json[r'latitude'] = null;
    }
    if (this.link != null) {
      json[r'link'] = this.link;
    } else {
      json[r'link'] = null;
    }
    if (this.longitude != null) {
      json[r'longitude'] = this.longitude;
    } else {
      json[r'longitude'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.neighborhood != null) {
      json[r'neighborhood'] = this.neighborhood;
    } else {
      json[r'neighborhood'] = null;
    }
    if (this.salePrice != null) {
      json[r'sale_price'] = this.salePrice;
    } else {
      json[r'sale_price'] = null;
    }
    if (this.additionalImageLink != null) {
      json[r'additional_image_link'] = this.additionalImageLink;
    } else {
      json[r'additional_image_link'] = null;
    }
    if (this.mainImage != null) {
      json[r'main_image'] = this.mainImage;
    } else {
      json[r'main_image'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsHotelAttributes] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelAttributes? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelAttributes[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelAttributes[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelAttributes(
        address: CatalogsHotelAddress.fromJson(json[r'address']),
        basePrice: mapValueOfType<String>(json, r'base_price'),
        brand: mapValueOfType<String>(json, r'brand'),
        category: mapValueOfType<String>(json, r'category'),
        customLabel0: mapValueOfType<String>(json, r'custom_label_0'),
        customLabel1: mapValueOfType<String>(json, r'custom_label_1'),
        customLabel2: mapValueOfType<String>(json, r'custom_label_2'),
        customLabel3: mapValueOfType<String>(json, r'custom_label_3'),
        customLabel4: mapValueOfType<String>(json, r'custom_label_4'),
        description: mapValueOfType<String>(json, r'description'),
        guestRatings: CatalogsHotelGuestRatings.fromJson(json[r'guest_ratings']),
        latitude: num.parse('${json[r'latitude']}'),
        link: mapValueOfType<String>(json, r'link'),
        longitude: json[r'longitude'] == null
            ? null
            : num.parse('${json[r'longitude']}'),
        name: mapValueOfType<String>(json, r'name'),
        neighborhood: json[r'neighborhood'] is Iterable
            ? (json[r'neighborhood'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        salePrice: mapValueOfType<String>(json, r'sale_price'),
        additionalImageLink: json[r'additional_image_link'] is Iterable
            ? (json[r'additional_image_link'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        mainImage: CatalogsHotelAttributesAllOfMainImage.fromJson(json[r'main_image']),
      );
    }
    return null;
  }

  static List<CatalogsHotelAttributes> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelAttributes>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelAttributes.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelAttributes> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelAttributes>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelAttributes.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelAttributes-objects as value to a dart map
  static Map<String, List<CatalogsHotelAttributes>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelAttributes>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelAttributes.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

