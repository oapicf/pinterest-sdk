//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_collections_header_type.g.dart';

class AdCollectionsHeaderType extends EnumClass {

  /// Collections ad header type for ads
  @BuiltValueEnumConst(wireName: r'SHOP_THIS_COLLECTION')
  static const AdCollectionsHeaderType SHOP_THIS_COLLECTION = _$SHOP_THIS_COLLECTION;
  /// Collections ad header type for ads
  @BuiltValueEnumConst(wireName: r'EXPLORE_THIS_COLLECTION')
  static const AdCollectionsHeaderType EXPLORE_THIS_COLLECTION = _$EXPLORE_THIS_COLLECTION;
  /// Collections ad header type for ads
  @BuiltValueEnumConst(wireName: r'NO_HEADER')
  static const AdCollectionsHeaderType NO_HEADER = _$NO_HEADER;

  static Serializer<AdCollectionsHeaderType> get serializer => _$adCollectionsHeaderTypeSerializer;

  const AdCollectionsHeaderType._(String name): super(name);

  static BuiltSet<AdCollectionsHeaderType> get values => _$values;
  static AdCollectionsHeaderType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdCollectionsHeaderTypeMixin = Object with _$AdCollectionsHeaderTypeMixin;

