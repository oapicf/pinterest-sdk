//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// L1 interest categories for filtering trends.
enum TrendsL1Interest {
  animals._(r'animals'),
  architecture._(r'architecture'),
  art._(r'art'),
  beauty._(r'beauty'),
  childrensFashion._(r'childrens_fashion'),
  design._(r'design'),
  diyAndCrafts._(r'diy_and_crafts'),
  education._(r'education'),
  electronics._(r'electronics'),
  entertainment._(r'entertainment'),
  eventPlanning._(r'event_planning'),
  finance._(r'finance'),
  foodAndDrinks._(r'food_and_drinks'),
  gardening._(r'gardening'),
  health._(r'health'),
  homeDecor._(r'home_decor'),
  mensFashion._(r'mens_fashion'),
  parenting._(r'parenting'),
  quotes._(r'quotes'),
  sport._(r'sport'),
  travel._(r'travel'),
  vehicles._(r'vehicles'),
  wedding._(r'wedding'),
  womensFashion._(r'womens_fashion'),
  ;

  /// Instantiate a new enum with the provided value.
  const TrendsL1Interest._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TrendsL1Interest] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TrendsL1Interest? fromJson(dynamic value) => TrendsL1InterestTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TrendsL1Interest]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TrendsL1Interest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendsL1Interest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendsL1Interest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TrendsL1Interest] to String,
/// and [decode] dynamic data back to [TrendsL1Interest].
class TrendsL1InterestTypeTransformer {
  factory TrendsL1InterestTypeTransformer() => _instance ??= const TrendsL1InterestTypeTransformer._();

  const TrendsL1InterestTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(TrendsL1Interest data) => data._value;

  /// Returns the instance of [TrendsL1Interest] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TrendsL1Interest? decode(dynamic data, {bool allowNull = true}) {
    if (data is TrendsL1Interest) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'animals': return TrendsL1Interest.animals;
        case r'architecture': return TrendsL1Interest.architecture;
        case r'art': return TrendsL1Interest.art;
        case r'beauty': return TrendsL1Interest.beauty;
        case r'childrens_fashion': return TrendsL1Interest.childrensFashion;
        case r'design': return TrendsL1Interest.design;
        case r'diy_and_crafts': return TrendsL1Interest.diyAndCrafts;
        case r'education': return TrendsL1Interest.education;
        case r'electronics': return TrendsL1Interest.electronics;
        case r'entertainment': return TrendsL1Interest.entertainment;
        case r'event_planning': return TrendsL1Interest.eventPlanning;
        case r'finance': return TrendsL1Interest.finance;
        case r'food_and_drinks': return TrendsL1Interest.foodAndDrinks;
        case r'gardening': return TrendsL1Interest.gardening;
        case r'health': return TrendsL1Interest.health;
        case r'home_decor': return TrendsL1Interest.homeDecor;
        case r'mens_fashion': return TrendsL1Interest.mensFashion;
        case r'parenting': return TrendsL1Interest.parenting;
        case r'quotes': return TrendsL1Interest.quotes;
        case r'sport': return TrendsL1Interest.sport;
        case r'travel': return TrendsL1Interest.travel;
        case r'vehicles': return TrendsL1Interest.vehicles;
        case r'wedding': return TrendsL1Interest.wedding;
        case r'womens_fashion': return TrendsL1Interest.womensFashion;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TrendsL1InterestTypeTransformer? _instance;
}

