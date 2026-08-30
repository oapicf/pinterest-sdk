//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'change_history_data_type.g.dart';

class ChangeHistoryDataType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'STRING')
  static const ChangeHistoryDataType STRING = _$STRING;
  @BuiltValueEnumConst(wireName: r'NUMERIC')
  static const ChangeHistoryDataType NUMERIC = _$NUMERIC;
  @BuiltValueEnumConst(wireName: r'MICROCURRENCY')
  static const ChangeHistoryDataType MICROCURRENCY = _$MICROCURRENCY;
  @BuiltValueEnumConst(wireName: r'DATE')
  static const ChangeHistoryDataType DATE = _$DATE;
  @BuiltValueEnumConst(wireName: r'BOOL')
  static const ChangeHistoryDataType BOOL = _$BOOL;
  @BuiltValueEnumConst(wireName: r'GENDER_LIST')
  static const ChangeHistoryDataType GENDER_LIST = _$GENDER_LIST;
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET_LIST')
  static const ChangeHistoryDataType AGE_BUCKET_LIST = _$AGE_BUCKET_LIST;
  @BuiltValueEnumConst(wireName: r'APPTYPE_LIST')
  static const ChangeHistoryDataType APPTYPE_LIST = _$APPTYPE_LIST;
  @BuiltValueEnumConst(wireName: r'COUNTRY_LIST')
  static const ChangeHistoryDataType COUNTRY_LIST = _$COUNTRY_LIST;
  @BuiltValueEnumConst(wireName: r'LOCALE_LIST')
  static const ChangeHistoryDataType LOCALE_LIST = _$LOCALE_LIST;

  static Serializer<ChangeHistoryDataType> get serializer => _$changeHistoryDataTypeSerializer;

  const ChangeHistoryDataType._(String name): super(name);

  static BuiltSet<ChangeHistoryDataType> get values => _$values;
  static ChangeHistoryDataType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ChangeHistoryDataTypeMixin = Object with _$ChangeHistoryDataTypeMixin;

