//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_search_by.g.dart';

/// The field to search member assets by
class AssetSearchBy extends EnumClass {

  @BuiltValueEnumConst(wireName: r'NAME')
  static const AssetSearchBy NAME = _$NAME;
  @BuiltValueEnumConst(wireName: r'ID')
  static const AssetSearchBy ID = _$ID;
  @BuiltValueEnumConst(wireName: r'NAME_OR_ID')
  static const AssetSearchBy NAME_OR_ID = _$NAME_OR_ID;
  @BuiltValueEnumConst(wireName: r'OWNER_NAME')
  static const AssetSearchBy OWNER_NAME = _$OWNER_NAME;
  @BuiltValueEnumConst(wireName: r'NAME_OR_OWNER')
  static const AssetSearchBy NAME_OR_OWNER = _$NAME_OR_OWNER;

  static Serializer<AssetSearchBy> get serializer => _$assetSearchBySerializer;

  const AssetSearchBy._(String name): super(name);

  static BuiltSet<AssetSearchBy> get values => _$values;
  static AssetSearchBy valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AssetSearchByMixin = Object with _$AssetSearchByMixin;

