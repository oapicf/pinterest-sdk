const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}battery_level`,
                label: `Battery charge level percentage - [${labelPrefix}battery_level]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}brand`,
                label: `Device brand - [${labelPrefix}brand]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}carrier`,
                label: `User device's mobile carrier. - [${labelPrefix}carrier]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cpu_cores`,
                label: `Number of CPU cores - [${labelPrefix}cpu_cores]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}external_storage_free_space`,
                label: `External storage size in GB - [${labelPrefix}external_storage_free_space]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}external_storage_size`,
                label: `External storage size in GB - [${labelPrefix}external_storage_size]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}form_factor`,
                label: `Device form factor - [${labelPrefix}form_factor]`,
                type: 'string',
                choices: [
                    'desktop',
                    'laptop',
                    'cellphone',
                    'tablet',
                    'smartwatch',
                    'tv',
                    'vr',
                    'console',
                    'other',
                ],
            },
            {
                key: `${keyPrefix}kernel_version`,
                label: `Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release - [${labelPrefix}kernel_version]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}languages`,
                label: `List of user installed languages. ISO 639-1 format - [${labelPrefix}languages]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}locale`,
                label: `Device locale BCP-47 format - [${labelPrefix}locale]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}model`,
                label: `Device model name - [${labelPrefix}model]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}network_type`,
                label: `Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() - [${labelPrefix}network_type]`,
                type: 'string',
                choices: [
                    'wifi',
                    'cellular_2g',
                    'cellular_3g',
                    'cellular_4g',
                    'cellular_5g',
                    'cellular_6g',
                    'ethernet',
                    'unknown',
                ],
            },
            {
                key: `${keyPrefix}os_family`,
                label: `OS Family - [${labelPrefix}os_family]`,
                type: 'string',
                choices: [
                    'ios',
                    'android',
                    'macos',
                    'windows',
                    'linux',
                    'bsd',
                    'other',
                ],
            },
            {
                key: `${keyPrefix}os_name`,
                label: `Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch - [${labelPrefix}os_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}os_release_name`,
                label: `Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin - [${labelPrefix}os_release_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}os_version`,
                label: `Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 - [${labelPrefix}os_version]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}screen_density`,
                label: `Screen density, PPI - [${labelPrefix}screen_density]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}screen_height`,
                label: `Screen height in pixels - [${labelPrefix}screen_height]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}screen_width`,
                label: `Screen width in pixels - [${labelPrefix}screen_width]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}storage_free_space`,
                label: `Internal storage size in GB - [${labelPrefix}storage_free_space]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}storage_size`,
                label: `Internal storage size in GB - [${labelPrefix}storage_size]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}timezone`,
                label: `Device timezone - [${labelPrefix}timezone]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}timezone_abbr`,
                label: `Timezone abbreviation - [${labelPrefix}timezone_abbr]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `Device type - [${labelPrefix}type]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'battery_level': bundle.inputData?.[`${keyPrefix}battery_level`],
            'brand': bundle.inputData?.[`${keyPrefix}brand`],
            'carrier': bundle.inputData?.[`${keyPrefix}carrier`],
            'cpu_cores': bundle.inputData?.[`${keyPrefix}cpu_cores`],
            'external_storage_free_space': bundle.inputData?.[`${keyPrefix}external_storage_free_space`],
            'external_storage_size': bundle.inputData?.[`${keyPrefix}external_storage_size`],
            'form_factor': bundle.inputData?.[`${keyPrefix}form_factor`],
            'kernel_version': bundle.inputData?.[`${keyPrefix}kernel_version`],
            'languages': bundle.inputData?.[`${keyPrefix}languages`],
            'locale': bundle.inputData?.[`${keyPrefix}locale`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'network_type': bundle.inputData?.[`${keyPrefix}network_type`],
            'os_family': bundle.inputData?.[`${keyPrefix}os_family`],
            'os_name': bundle.inputData?.[`${keyPrefix}os_name`],
            'os_release_name': bundle.inputData?.[`${keyPrefix}os_release_name`],
            'os_version': bundle.inputData?.[`${keyPrefix}os_version`],
            'screen_density': bundle.inputData?.[`${keyPrefix}screen_density`],
            'screen_height': bundle.inputData?.[`${keyPrefix}screen_height`],
            'screen_width': bundle.inputData?.[`${keyPrefix}screen_width`],
            'storage_free_space': bundle.inputData?.[`${keyPrefix}storage_free_space`],
            'storage_size': bundle.inputData?.[`${keyPrefix}storage_size`],
            'timezone': bundle.inputData?.[`${keyPrefix}timezone`],
            'timezone_abbr': bundle.inputData?.[`${keyPrefix}timezone_abbr`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
