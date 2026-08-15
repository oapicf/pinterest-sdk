//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_type.g.dart';

class CatalogsType extends EnumClass {

  /// Type of the catalog entity.
  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsType RETAIL = _$RETAIL;
  /// Type of the catalog entity.
  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsType HOTEL = _$HOTEL;
  /// Type of the catalog entity.
  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsType CREATIVE_ASSETS = _$CREATIVE_ASSETS;

  static Serializer<CatalogsType> get serializer => _$catalogsTypeSerializer;

  const CatalogsType._(String name): super(name);

  static BuiltSet<CatalogsType> get values => _$values;
  static CatalogsType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CatalogsTypeMixin = Object with _$CatalogsTypeMixin;

