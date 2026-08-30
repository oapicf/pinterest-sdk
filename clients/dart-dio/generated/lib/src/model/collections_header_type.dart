//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'collections_header_type.g.dart';

class CollectionsHeaderType extends EnumClass {

  /// Collections ad header type
  @BuiltValueEnumConst(wireName: r'SHOP_THIS_COLLECTION')
  static const CollectionsHeaderType SHOP_THIS_COLLECTION = _$SHOP_THIS_COLLECTION;
  /// Collections ad header type
  @BuiltValueEnumConst(wireName: r'EXPLORE_THIS_COLLECTION')
  static const CollectionsHeaderType EXPLORE_THIS_COLLECTION = _$EXPLORE_THIS_COLLECTION;
  /// Collections ad header type
  @BuiltValueEnumConst(wireName: r'NO_HEADER')
  static const CollectionsHeaderType NO_HEADER = _$NO_HEADER;
  /// Collections ad header type
  @BuiltValueEnumConst(wireName: r'ON_SALE')
  static const CollectionsHeaderType ON_SALE = _$ON_SALE;
  /// Collections ad header type
  @BuiltValueEnumConst(wireName: r'GET_DEAL')
  static const CollectionsHeaderType GET_DEAL = _$GET_DEAL;

  static Serializer<CollectionsHeaderType> get serializer => _$collectionsHeaderTypeSerializer;

  const CollectionsHeaderType._(String name): super(name);

  static BuiltSet<CollectionsHeaderType> get values => _$values;
  static CollectionsHeaderType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CollectionsHeaderTypeMixin = Object with _$CollectionsHeaderTypeMixin;

